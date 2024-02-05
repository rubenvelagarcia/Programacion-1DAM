package rel6Ej2;
import java.util.Scanner;

public class Principal {
	
	private static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion, cantidad, cantidadInicial;
		char SoN;
		boolean terminar=false;
		do {
		System.out.println("¿Saldo inicial de la cuenta?");
		cantidadInicial=Integer.parseInt(teclado.nextLine());
		} while(cantidadInicial<0);
		Cuenta cuenta1=new Cuenta(cantidadInicial);
		do {
			generarMenu();
			do {
				System.out.println("Que desea realizar (1-4)");
				opcion=Integer.parseInt(teclado.nextLine());
			} while (opcion<1||opcion>4);
			switch (opcion) {
			case 1:
				do {
					System.out.println("¿Cantidad a retirar?");
					cantidad=Integer.parseInt(teclado.nextLine());
				} while (cantidad<1||cantidad>500);
				cuenta1.retirarDinero(cantidad);
				break;
			case 2:
				do {
					System.out.println("¿Cantidad a ingresar?");
					cantidad=Integer.parseInt(teclado.nextLine());
				} while (cantidad<1||cantidad>500);
				cuenta1.ingresarDinero(cantidad);
				break;
			case 3:
				System.out.println("Saldo: "+cuenta1.getSaldo());
				System.out.println("Nº de ingresos: "+cuenta1.getIngresos());
				System.out.println("Nº de reintegros: "+cuenta1.getReintegros());
				break;
			case 4:
				do {
					System.out.println("¿Desea finalizar operaciones(S-N)?");
					SoN=teclado.nextLine().charAt(0);
				} while (SoN!='S'&&SoN!='N');
				if (SoN=='S') {
					terminar=true;
					System.out.println("Saldo: "+ cuenta1.getSaldo());
				}
				break;
			default:
				break;
			}
		} while (terminar==false);
		
		
	}
	public static void generarMenu() {
		System.out.println("1-Realizar un reintegro");
		System.out.println("2-Realizar un ingreso");
		System.out.println("3-Consultar saldo y número de movimientos");
		System.out.println("4-Finalizar operaciones");
	}

}
