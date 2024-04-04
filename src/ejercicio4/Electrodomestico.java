package ejercicio4;

public class Electrodomestico {

	enum colores {
		blanco, negro, rojo, azul, gris
	}

	enum consumoEng {
		A, B, C, D, E, F
	}

	protected double precioBase = 100;
	protected colores color = colores.blanco;
	protected consumoEng consumo = consumoEng.F;
	protected double peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}
	
	public Electrodomestico(double precioBase, colores color, consumoEng consumo, double peso) {
		if (color != null && !color.equals("")) {
			this.color = color;
		}
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

}
