package ejercicio4;

/**
 * La clase Television representa un tipo de electrodoméstico que es un
 * televisor. Hereda de la clase Electrodomestico y tiene atributos como
 * resolución y sintonizador TDT.
 */
public class Television extends Electrodomestico {

	private int resolucion = 20;
	private boolean sintonizadorTDT = false;

	/**
	 * Constructor que inicializa un televisor con valores predeterminados.
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor que inicializa el precio base y el peso del televisor.
	 * 
	 * @param precioBase Precio base del televisor.
	 * @param peso       Peso del televisor.
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor que inicializa todos los atributos del televisor.
	 *
	 * @param precioBase      Precio base del televisor.
	 * @param color           Color del televisor.
	 * @param consumo         Consumo energético del televisor.
	 * @param peso            Peso del televisor.
	 * @param sintonizadorTDT Indica si el televisor tiene sintonizador TDT.
	 * @param resolucion      Resolución del televisor en pulgadas.
	 */
	public Television(double precioBase, String color, char consumo, double peso, boolean sintonizadorTDT,
			int resolucion) {
		super(precioBase, color, consumo, peso);

		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Método get para obtener la resolución del televisor.
	 * 
	 * @return La resolución del televisor en pulgadas.
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * Método get para verificar si el televisor tiene sintonizador TDT.
	 * 
	 * @return true si el televisor tiene sintonizador TDT, false en caso contrario.
	 */
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * Método que calcula el precio final del televisor, teniendo en cuenta el
	 * precio base y añadiendo suplementos según la resolución y la presencia del
	 * sintonizador TDT.
	 * 
	 * @return El precio final del televisor.
	 */
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();

		if (resolucion > 40) {
			precioFinal *= 1.30;
		}

		if (sintonizadorTDT) {
			precioFinal += 50;
		}

		return precioFinal;
	}
}
