package ejercicio5;

/**
 * La clase abstracta Poligono nos proporciona un número de variable para todos
 * los polígonos, como el número de lados y un método abstracto para calcular el
 * área.
 */
public abstract class Poligono {

	/**
	 * Número de lados del polígono.
	 */
	protected int numerosLados;

	/**
	 * Constructor sin parametros de la clase Poligono.
	 */
	public Poligono() {

	}

	/**
	 * Constructor con parametros de la clase Poligono.
	 * 
	 * @param numerosLados El número de lados del polígono.
	 */
	public Poligono(int numerosLados) {
		if (numerosLados > 0) {
			this.numerosLados = numerosLados;
		}
	}

	/**
	 * Obtiene el número de lados del polígono.
	 * 
	 * @return El número de lados del polígono.
	 */
	public int getNumerosLados() {
		return numerosLados;
	}

	/**
	 * Devuelve una representación en cadena del objeto Poligono.
	 * 
	 * @return Una cadena que indica el número de lados del polígono.
	 */
	public String toString() {
		return "Número de lados --> " + getNumerosLados();
	}

	/**
	 * Método abstracto para calcular el área del polígono. Este metodo debe ser
	 * implementado por las clases Rectangulo y Triangulo para proporcionar el area
	 * de cada polígono.
	 * 
	 * @return El área del polígono.
	 */
	abstract double area();
}
