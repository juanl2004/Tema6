package Ejercicio2;

public class Operario extends Empleado {
	
	public Operario(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		String operario = super.toString();
		operario += " -> Operario ";
		return operario;
	}
}
