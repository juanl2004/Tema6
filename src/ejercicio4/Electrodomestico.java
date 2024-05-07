package ejercicio4;

/**
 * La clase Electrodomestico representa un electrodoméstico con precio base,
 * color, consumo energético y peso. Hay métodos para obtener estos atributos y
 * calcular el precio final del electrodoméstico.
 */
public class Electrodomestico  implements Comparable<Electrodomestico>{

	/**
	 * Enumeración que nos muestra los colores disponibles para el electrodoméstico.
	 */
	enum colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Enumeración que nos muestra los niveles de consumo energético del
	 * electrodoméstico.
	 */
	enum consumoEng {
		A, B, C, D, E, F
	}

	protected double precioBase = 100;
	protected colores color = colores.BLANCO;
	protected consumoEng consumo = consumoEng.F;
	protected double peso = 5;

	/**
	 * Constructor sin parámetros.
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor que inicializa el precio base y el peso del electrodoméstico.
	 * 
	 * @param precioBase Precio base del electrodoméstico.
	 * @param peso       Peso del electrodoméstico.
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor que inicializa todos los atributos del electrodoméstico.
	 * 
	 * @param precioBase        Precio base del electrodoméstico.
	 * @param color             Color del electrodoméstico.
	 * @param consumoEnergetico Consumo energético del electrodoméstico.
	 * @param peso              Peso del electrodoméstico.
	 */
	public Electrodomestico(double precioBase, String color, char consumo, double peso) {

		this(precioBase, peso);

		if (color != null && (color.equals(colores.BLANCO.toString()) || color.equals(colores.NEGRO.toString())
				|| color.equals(colores.ROJO.toString()) || color.equals(colores.AZUL.toString())
				|| color.equals(colores.GRIS.toString()))) {
			this.color = colores.valueOf(color.toUpperCase());
		}

		if ((consumo >= 'A' && consumo <= 'F')) {
			this.consumo = consumoEng.valueOf(String.valueOf(consumo));
		}

	}

	/**
	 * Método get para obtener el precio base del electrodoméstico.
	 * 
	 * @return El precio base del electrodoméstico.
	 */
	public double getPrecioBase() {
		return this.precioBase;
	}

	/**
	 * Método get para obtener el color del electrodoméstico.
	 * 
	 * @return El color del electrodoméstico.
	 */
	public String getColor() {
		return String.valueOf(color);
	}

	/**
	 * Método get para obtener el consumo energético del electrodoméstico.
	 * 
	 * @return El consumo energético del electrodoméstico.
	 */
	public char getConsumo() {
		return String.valueOf(consumo).charAt(0);
	}

	/**
	 * Método get para obtener el peso del electrodoméstico.
	 * 
	 * @return El peso del electrodoméstico.
	 */
	public double getPeso() {
		return this.peso;
	}

	/**
	 * Método privado que comprueba el consumo energético del electrodoméstico.
	 * 
	 * @param letra La letra que representa el consumo energético.
	 */
	private void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E', 'F':
			this.consumo = consumoEng.valueOf(String.valueOf(letra));
			break;

		default:
			this.consumo = consumoEng.F;
			break;
		}
	}

	/**
	 * Método privado que comprueba el color del electrodoméstico.
	 * 
	 * @param color El color del electrodoméstico.
	 */
	private void comprobarColor(String color) {
		String colorMayus = color.toUpperCase();

		switch (colorMayus) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS":
			this.color = colores.valueOf(colorMayus);
			break;
		default:
			this.color = colores.BLANCO;
			break;
		}
	}

	/**
	 * Método que calcula el precio final del electrodoméstico teniendo en cuenta el
	 * consumo energético y el peso del mismo.
	 * 
	 * @return El precio final del electrodoméstico.
	 */
	public double precioFinal() {
		double precioFinal = precioBase;

		switch (consumo) {
		case A:
			precioFinal += 100;
			break;
		case B:
			precioFinal += 80;
			break;
		case C:
			precioFinal += 60;
			break;
		case D:
			precioFinal += 50;
			break;
		case E:
			precioFinal += 30;
			break;
		case F:
			precioFinal += 10;
			break;
		}

		if (peso >= 0 && peso < 20) {
			precioFinal += 10;
		} else if (peso >= 20 && peso < 50) {
			precioFinal += 50;
		} else if (peso >= 50 && peso < 80) {
			precioFinal += 80;
		} else if (peso >= 80) {
			precioFinal += 100;
		}

		return precioFinal;
	}

	@Override
	public int compareTo(Electrodomestico otro) {
		// TODO Auto-generated method stub
		return 0;
	}
}
