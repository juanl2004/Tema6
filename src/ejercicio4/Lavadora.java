package ejercicio4;

/**
 * La clase Lavadora representa un tipo de electrodoméstico que es una lavadora.
 * Hereda de la clase Electrodomestico y añade un atributo (carga).
 */
public class Lavadora extends Electrodomestico {

	private int carga = 5; 

	/**
	 * Constructor que inicializa una lavadora con valores predeterminados.
	 */
	public Lavadora() {

	}

	/**
	 * Constructor que inicializa el precio base y el peso de la lavadora.
	 * 
	 * @param precioBase Precio base de la lavadora.
	 * @param peso       Peso de la lavadora.
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor que inicializa todos los atributos de la lavadora.
	 * 
	 * @param carga      Carga de la lavadora.
	 * @param precioBase Precio base de la lavadora.
	 * @param color      Color de la lavadora.
	 * @param consumo    Consumo energético de la lavadora.
	 * @param peso       Peso de la lavadora.
	 */
	public Lavadora(int carga, double precioBase, colores color, consumoEng consumo, double peso) {
		super(precioBase, color, consumo, peso);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * Método get para obtener la carga de la lavadora.
	 * 
	 * @return La carga de la lavadora.
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Método que calcula el precio final de la lavadora, teniendo en cuenta el
	 * precio base y añadiendo un suplemento si la carga es mayor a los 30 kg.
	 * 
	 * @return El precio final de la lavadora.
	 */
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();

		if (carga > 30) {
			precioFinal += 50; 
		}

		return precioFinal;
	}
}
