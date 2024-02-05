package rel6Ej3;
import java.util.Scanner;

public class MaquinaCafe {
	private static Scanner teclado=new Scanner(System.in);
//Atributos
private int depositoCafe;
private int depositoLeche;
private int depositoVasos;
private double monedero;
private static final double PRECIO_CAFE=1;
private static final double PRECIO_LECHE=0.8;
private static final double PRECIO_CAFE_CON_LECHE=1.5;
//Constructor
public MaquinaCafe (double dineroInicial) {
	monedero=dineroInicial;
	depositoCafe=50;
	depositoLeche=50;
	depositoVasos=80;
}
//Metodos
public int getDepositoCafe() {
	return depositoCafe;
}
public int getDepositoLeche() {
	return depositoLeche;
}
public int getDepositoVasos() {
	return depositoVasos;
}
public double getMonedero() {
	return monedero;
}
@Override
public String toString() {
	return "Deposito de cafe: "+depositoCafe+"/50, deposito de leche: "+depositoLeche+"/50, deposito de vasos: "+depositoVasos+"/80, monedero: "+monedero+"€"  ;
}
public void llenarDepositos() {
	depositoCafe=50;
	depositoLeche=50;
	depositoVasos=80;
}

public void vaciarMonedero() {
	monedero=0;
}
public void servir(int pedido) {
	int dinero;
	if(pedido==1) {
		System.out.println("¿Cantidad a ingresar?:");
		
	}
}




}
