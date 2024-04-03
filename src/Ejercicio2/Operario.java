package Ejercicio2;

/**
 * La clase Operario representa a un operario, que es un tipo de empleado.
 */
public class Operario extends Empleado {

	/**
	 * Constructor con parametro de la clase Operario.
	 * 
	 * @param nombre El nombre del operario.
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	/**
	 * Método para obtener una representación en forma de cadena del operario.
	 * 
	 * @return Una cadena que representa al operario.
	 */
	@Override
	public String toString() {
		String operario = super.toString();
		operario += " -> Operario ";
		return operario;
	}
}
