package Ejercicio2;

public class Tecnico extends Operario {
	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		String tecnico = super.toString();
		tecnico += " -> Tecnico";
		return tecnico;
	}
}

