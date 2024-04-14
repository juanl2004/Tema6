package interfaces_3;

import java.util.Random;

/**
 * Clase que representa a un animal doméstico.
 */
public class AnimalDomestico implements Animal {

	private String nombre = "";
	private String raza = "";
	private double peso;
	private String color = "";

	/**
	 * Constructor con parametros de la clase AnimalDomestico.
	 * 
	 * @param nombre El nombre del animal.
	 * @param raza   La raza del animal.
	 * @param peso   El peso del animal.
	 * @param color  El color del animal.
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (raza != null && !raza.equals("")) {
			this.raza = raza;
		}

		if (peso > 0) {
			this.peso = peso;
		}

		if (color != null && !color.equals("")) {
			this.color = color;
		}
	}

	/**
	 * Método para obtener el nombre del animal.
	 * 
	 * @return El nombre del animal.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para asignar el nombre del animal.
	 * 
	 * @param nombre El nuevo nombre del animal.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método para obtener la raza del animal.
	 * 
	 * @return La raza del animal.
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * Método para asignar la raza del animal.
	 * 
	 * @param raza La nueva raza del animal.
	 */
	public void setRaza(String raza) {
		if (raza != null && !raza.equals("")) {
			this.raza = raza;
		}
	}

	/**
	 * Método para obtener el peso del animal.
	 * 
	 * @return El peso del animal.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método para asignar el peso del animal.
	 * 
	 * @param peso El nuevo peso del animal.
	 */
	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Método para obtener el color del animal.
	 * 
	 * @return El color del animal.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Método para asignar el color del animal.
	 * 
	 * @param color El nuevo color del animal.
	 */
	public void setColor(String color) {
		if (color != null && !color.equals("")) {
			this.color = color;
		}
	}

	/**
	 * Método para simular el acto de comer del animal.
	 */
	@Override
	public void comer() {
	}

	/**
	 * Método para simular el acto de dormir del animal.
	 */
	@Override
	public void dormir() {
	}

	/**
	 * Método para simular el acto de hacer ruido del animal.
	 */
	@Override
	public void hacerRuido() {
		// Método para simular el acto de hacer ruido del animal
	}

	/**
	 * Método que simula el acto de vacunar al animal.
	 */
	public void vacunar() {
	}

	/**
	 * Método que simula el acto de hacer caso por parte del animal.
	 * 
	 * @return true si el animal hace caso, false si no hace.
	 */
	public boolean hacerCaso() {
		Random random = new Random();
		int probabilidad;
		probabilidad = random.nextInt(100);

		return probabilidad < 90; // Devuelve true con una probabilidad del 90%.
	}

}