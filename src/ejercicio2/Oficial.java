package ejercicio2;

/**
 * La clase Oficial representa a un oficial, que es un tipo de operario.
 */
public class Oficial extends Operario {

	/**
	 * Constructor con parametro de la clase Oficial.
	 * 
	 * @param nombre El nombre del oficial.
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	/**
	 * Método para obtener una representación en forma de cadena del oficial.
	 * 
	 * @return Una cadena que representa al oficial.
	 */
	@Override
	public String toString() {
		String oficial = super.toString();
		oficial += " -> Oficial ";
		return oficial;
	}
}
