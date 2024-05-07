package interfaces_3;

import java.util.Random;

/**
 * Clase que representa a un animal doméstico.
 */
public abstract class AnimalDomestico implements Animal {
	protected String nombre = "";
	protected String raza = "";
	protected double peso;
	protected String color = "";
	protected boolean vacunado = false;

	/**
	 * Constructor con parametros de la clase AnimalDomestico.
	 * 
	 * @param nombre   El nombre del animal.
	 * @param raza     La raza del animal.
	 * @param peso     El peso del animal.
	 * @param color    El color del animal.
	 * @param vacunado Si el perro esta vacunado o no.
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color, boolean vacunado) {
		super();
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

		this.vacunado = vacunado;
	}

	/**
	 * Método para simular el acto de comer del animal.
	 */
	@Override
	public void comer() {
		System.out.println(this.nombre + " come");
	}

	/**
	 * Método para simular el acto de dormir del animal.
	 */
	@Override
	public void dormir() {
		System.out.println(this.nombre + " duerme");
	}

	/**
	 * Método que nos dice que el animal ha sido vacunado.
	 */
	public void vacunar() {
		this.vacunado = true;
	}

	
	
	 

	// Método para simular el acto de hacer ruido del animal
	@Override
	public abstract void hacerRuido();

	// Método para simular el acto de hacer caso del animal.
	public abstract boolean hacerCaso();

	@Override
	public String toString() {
		String str = "";

		str += "Nombre: " + this.nombre;
		str += "\nRaza: " + this.raza;
		str += "\nPeso: " + this.peso;
		str += "\nColor: " + this.color;
		str += "\nVacunado: " + (this.vacunado ? "Sí" : "No");

		return str;
	}

}
