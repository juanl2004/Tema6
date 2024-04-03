package ejercicio2;

/**
 * La clase Tecnico representa a un técnico, que es un tipo de operario.
 */
public class Tecnico extends Operario {

	/**
	 * Constructor con parametro de la clase Tecnico.
	 * 
	 * @param nombre El nombre del técnico.
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Método para obtener una representación en forma de cadena del técnico.
	 * 
	 * @return Una cadena que representa al técnico.
	 */
	@Override
	public String toString() {
		String tecnico = super.toString();
		tecnico += " -> Técnico";
		return tecnico;
	}
}
