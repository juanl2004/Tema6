package Ejercicio2;

public class Directivo extends Empleado {
	
	public Directivo(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		String directivo = super.toString();
		directivo += " -> Directivo ";
		return directivo;
	}
}