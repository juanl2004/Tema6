package ejercicio2;

/**
 * La clase Empleado representa a un empleado con un nombre.
 */
public class Empleado {
	private String nombre = "";

	/**
	 * Constructor con parametro de la clase Empleado.
	 * 
	 * @param nombre El nombre del empleado.
	 */
	public Empleado(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método para establecer el nombre del empleado.
	 * 
	 * @param nombre El nuevo nombre del empleado.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !this.nombre.equals(nombre)) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método para obtener el nombre del empleado.
	 * 
	 * @return El nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para obtener una representación en forma de cadena del empleado.
	 * 
	 * @return Una cadena que representa al nombre empleado.
	 */
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
}
