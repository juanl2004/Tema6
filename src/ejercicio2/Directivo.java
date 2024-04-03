package ejercicio2;

/**
 * La clase Directivo representa a un directivo, que es un tipo de empleado.
 */
public class Directivo extends Empleado {

	/**
	 * Constructor con parametro de la clase Directivo.
	 * 
	 * @param nombre El nombre del directivo.
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * Método para obtener una representación en forma de cadena del directivo.
	 * 
	 * @return Una cadena que representa al directivo.
	 */
	@Override
	public String toString() {
		String directivo = super.toString();
		directivo += " -> Directivo ";
		return directivo;
	}
}
