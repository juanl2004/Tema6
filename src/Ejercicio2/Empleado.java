package Ejercicio2;

public class Empleado {
	private String nombre = "";
	
	public Empleado (String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	public void setNombre(String nombre) {
		if (nombre != null && !this.nombre.equals(nombre)) {
			this.nombre = nombre;
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public String toString() {
		String empleado = "";
		
		empleado = "Empleado " + this.nombre;
		
		return empleado;
	}
}
