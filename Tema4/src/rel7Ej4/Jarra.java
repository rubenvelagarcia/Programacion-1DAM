package rel7Ej4;

public class Jarra {
	private int capacidad;
	private int cantidad;
	private static int totalAguaConsumida=0;
	public Jarra(int capacidad) {
		super();
		this.capacidad = capacidad;
		cantidad=0;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public static int getTotalAguaConsumida() {
		return totalAguaConsumida;
	}
	@Override
	public String toString() {
		return "Jarra [capacidad=" + capacidad + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
