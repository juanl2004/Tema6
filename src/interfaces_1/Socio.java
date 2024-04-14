package interfaces_1;

/**
 * Clases que representa a una persona (socio).
 */
public class Socio implements Comparable<Socio> {

	/**
	 * Atributo que representa el ID del socio.
	 */
	private int id;
	/**
	 * Atributo que representa el nombre del socio.
	 */
	private String nombre = "";
	/**
	 * Atributo que representa la edad del socio.
	 */
	private int edad;

	/**
	 * Constructor con parametros de la clase Socio.
	 * 
	 * @param id     El ID del socio.
	 * @param nombre El nombre del socio.
	 * @param edad   La edad del socio.
	 */
	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método compareTo para comparar socios mediante un número de identificación.
	 * 
	 * @param El socio con el que se compara.
	 * @return -1 si el ID del socio es menor que el socio dado. 1 si el ID del
	 *         socio es mayor. 0 si son iguales.
	 */
	@Override
	public int compareTo(Socio o) {
		int res = 0;

		if (this.id < o.id) {
			res = -1;
		} else if (this.id > o.id) {
			res = 1;
		}
		return res;
	}

	/**
	 * Método toString que devuelve los datos del Socio.
	 * 
	 * @return Una cadena que representa al socio.
	 */
	public String toString() {
		String cad;

		cad = "Socio --> " + this.id + "\n";
		cad += "    Nombre: " + this.nombre + "\n";
		cad += "    Edad: " + this.edad + "\n";

		return cad;
	}
}
