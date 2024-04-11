package ejercicio5;

/**
 * La clase Triangulo representa un triangulo, un tipo de polígono con tres
 * lados.
 */
public class Triangulo extends Poligono {

	/**
	 * El primer lado del triangulo.
	 */
	private int lado1;

	/**
	 * El segundo lado del triangulo.
	 */
	private int lado2;

	/**
	 * El tercer lado del triangulo.
	 */
	private int lado3;

	/**
	 * Constructor sin parametros de la clase Triangulo.
	 */
	public Triangulo() {
		super(3);
	}

	/**
	 * Constructor con parametros de la clase Triangulo que inicializa los lados del
	 * triangulo.
	 * 
	 * @param lado1 La longitud del primer lado del triangulo.
	 * @param lado2 La longitud del segundo lado del triangulo.
	 * @param lado3 La longitud del tercer lado del triangulo.
	 */
	public Triangulo(int lado1, int lado2, int lado3) {

		super(3);

		if (lado1 > 0) {
			this.lado1 = lado1;
		}

		if (lado2 > 0) {
			this.lado2 = lado2;
		}

		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * Método para obtener la longitud del primer lado del triangulo.
	 *
	 * @return La longitud del primer lado del triangulo.
	 */
	public int getLado1() {
		return lado1;
	}

	/**
	 * Método para introducir la longitud del primer lado del triangulo.
	 *
	 * @param lado1 La longitud del primer lado del triangulo.
	 */
	public void setLado1(int lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	/**
	 * Método para obtener la longitud del segundo lado del triangulo.
	 *
	 * @return La longitud del segundo lado del triangulo.
	 */
	public int getLado2() {
		return lado2;
	}

	/**
	 * Método para introducir la longitud del segundo lado del triangulo.
	 *
	 * @param lado1 La longitud del segundo lado del triangulo.
	 */
	public void setLado2(int lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Método para obtener la longitud del tercer lado del triangulo.
	 *
	 * @return La longitud del tercer lado del triangulo.
	 */
	public int getLado3() {
		return lado3;
	}

	/**
	 * Método para introducir la longitud del tercer lado del triangulo.
	 *
	 * @param lado1 La longitud del tercer lado del triangulo.
	 */
	public void setLado3(int lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}
	
	/**
	 * Devuelve una cadena indicando los lados del triangulo.
	 *
	 * @return Una cadena que representa el triangulo con sus lados.
	 */
	@Override
	public String toString() {
		return "Tipo Poligono --> Triangulo con: " + "Lado 1 = " + this.lado1 + ", Lado 2 = " + this.lado2
				+ ", Lado 3 = " + this.lado3;
	}

	/**
	 * Calcula el área del triangulo.
	 *
	 * @return El área del triangulo.
	 */
	@Override
	double area() {
		double semiPerimetro = (this.lado1 + this.lado2 + this.lado3) / 2;

		return Math.sqrt(semiPerimetro * (semiPerimetro - this.lado1) * (semiPerimetro - this.lado2)
				* (semiPerimetro - this.lado3));
	}

}
