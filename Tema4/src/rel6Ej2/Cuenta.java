package rel6Ej2;

public class Cuenta {
//Atributos
	private double saldo;
	private int totalIngresos;
	private int totalReintegro;
	public static final int CANTIDAD_MAXIMA=500;
//Constructor
	public Cuenta (double saldo) {
		this.saldo=saldo;
		totalIngresos=0;
		totalReintegro=0;
	}
	public Cuenta () {
		saldo=0;
		totalIngresos=0;
		totalReintegro=0;
	}
//Metodos
	public double getSaldo() {
		return saldo;
	}
	public int getReintegros() {
		return totalReintegro;
	}
	public int getIngresos() {
		return totalIngresos;
	}
	public String toString() {
		return "El saldo de su cuenta es "+saldo+"€, has realizado "+totalIngresos+" ingresos y "+totalReintegro+" reintegros";
	}
	public void ingresarDinero(double cantidad) {
		if (cantidad<=CANTIDAD_MAXIMA&&cantidad>0) {
			saldo=saldo+cantidad;
		}
		else {
			System.out.println("Error");//Excepcion
		}
		totalIngresos++;
	}
	public void retirarDinero(double cantidad) {
		if ((cantidad<=CANTIDAD_MAXIMA&&cantidad>0)&&(cantidad<=saldo)) {
			saldo=saldo-cantidad;
		}
		else {
			System.out.println("Error");//Excepcion
		}
		totalReintegro++;
	}
	
}
