package ejercicio4;

/**
 * La clase Electrodomestico representa un electrodoméstico con precio base,
 * color, consumo energético y peso. Hay métodos para obtener estos atributos y
 * calcular el precio final del electrodoméstico.
 */
public class Electrodomestico {

	/**
	 * Enumeración que nos muestra los colores disponibles para el electrodoméstico.
	 */
	enum colores {
		blanco, negro, rojo, azul, gris
	}

	/**
	 * Enumeración que nos muestra los niveles de consumo energético del
	 * electrodoméstico.
	 */
	enum consumoEng {
		A, B, C, D, E, F
	}

	protected double precioBase = 100; 
	protected colores color = colores.blanco;
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
	public Electrodomestico(double precioBase, colores color, consumoEng consumoEnergetico, double peso) {

		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		if (color != null && (color.equals(colores.blanco) || color.equals(colores.negro) || color.equals(colores.rojo)
				|| color.equals(colores.azul) || color.equals(colores.gris))) {
			this.color = color;
		}

		if (consumoEnergetico != null
				&& (consumoEnergetico.equals(consumoEng.A) || consumoEnergetico.equals(consumoEng.B)
						|| consumoEnergetico.equals(consumoEng.C) || consumoEnergetico.equals(consumoEng.D)
						|| consumoEnergetico.equals(consumoEng.E) || consumoEnergetico.equals(consumoEng.F))) {
			this.consumo = consumoEnergetico;
		}

		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Método get para obtener el precio base del electrodoméstico.
	 * 
	 * @return El precio base del electrodoméstico.
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Método get para obtener el color del electrodoméstico.
	 * 
	 * @return El color del electrodoméstico.
	 */
	public colores getColor() {
		return color;
	}

	/**
	 * Método get para obtener el consumo energético del electrodoméstico.
	 * 
	 * @return El consumo energético del electrodoméstico.
	 */
	public consumoEng getConsumo() {
		return consumo;
	}

	/**
	 * Método get para obtener el peso del electrodoméstico.
	 * 
	 * @return El peso del electrodoméstico.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método privado que comprueba el consumo energético del electrodoméstico.
	 * 
	 * @param letra La letra que representa el consumo energético.
	 */
	private void comprobarConsumoEnergetico(char letra) {
		boolean letraValida = false;
		for (consumoEng ce : consumoEng.values()) {
			if (Character.toUpperCase(letra) == ce.name().charAt(0)) {
				this.consumo = ce;
				letraValida = true;
				break;
			}
		}
		if (!letraValida) {
			this.consumo = consumoEng.F; 
		}
	}

	/**
	 * Método privado que comprueba el color del electrodoméstico.
	 * 
	 * @param color El color del electrodoméstico.
	 */
	private void comprobarColor(String color) {
		boolean colorValido = false;
		for (colores c : colores.values()) {
			if (color.equalsIgnoreCase(c.name())) {
				this.color = c;
				colorValido = true;
				break;
			}
		}
		if (!colorValido) {
			this.color = colores.blanco;
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
}
