package ejercicio5;

/**
 * La clase Rectangulo representa un rectángulo, un tipo de polígono con dos
 * lados.
 */
public class Rectangulo extends Poligono {

	/**
	 * El primer lado del rectángulo.
	 */
	private int lado1;

	/**
	 * El segundo lado del rectángulo.
	 */
	private int lado2;

	/**
	 * Constructor sin parametros de la clase Rectangulo.
	 */
	public Rectangulo() {

	}

	/**
	 * Constructor con parametros de la clase Rectangulo que inicializa los lados del rectángulo.
	 *
	 * @param numerosLados El número de lados del rectángulo (4).
	 * @param lado1        La longitud del primer lado del rectángulo.
	 * @param lado2        La longitud del segundo lado del rectángulo.
	 */
	public Rectangulo(int numerosLados, int lado1, int lado2) {
		super(numerosLados);

		if (lado1 > 0) {
			this.lado1 = lado1;
		}

		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Método para obtener la longitud del primer lado del rectángulo.
	 *
	 * @return La longitud del primer lado del rectángulo.
	 */
	public int getLado1() {
		return lado1;
	}

	/**
	 * Método para introducir la longitud del primer lado del rectángulo.
	 *
	 * @param lado1 La longitud del primer lado del rectángulo.
	 */
	public void setLado1(int lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	/**
	 * Método para obtener la longitud del segundo lado del rectángulo.
	 *
	 * @return La longitud del segundo lado del rectángulo.
	 */
	public int getLado2() {
		return lado2;
	}

	/**
	 * Método para introducir la longitud del segundo lado del rectángulo.
	 *
	 * @param lado2 La longitud del segundo lado del rectángulo.
	 */
	public void setLado2(int lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Devuelve una cadena indicando los lados del rectángulo.
	 *
	 * @return Una cadena que representa el rectángulo con sus lados.
	 */
	public String toString() {
		return "Tipo Poligono --> Rectangulo con: " + "Lado 1 = " + this.lado1 + ", Lado 2 = " + this.lado2;
	}

	/**
	 * Calcula el área del rectángulo.
	 *
	 * @return El área del rectángulo.
	 */
	@Override
	double area() {
		return this.lado1 * this.lado2;
	}

}
