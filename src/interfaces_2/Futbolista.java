package interfaces_2;

import java.util.Objects;

/**
 * Clase que representa a un futbolista
 */
public class Futbolista implements Comparable<Futbolista> {
	int numCamiseta;
	String nombre = "";
	int edad;
	int numGoles;

	/**
	 * Constructor con parametros de la clase Futbolista.
	 * 
	 * @param numCamiseta El número de camiseta del futbolista.
	 * @param nombre      El nombre del futbolista.
	 * @param edad        La edad del futbolista.
	 * @param numGoles    El número de goles anotados por el futbolista.
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (edad > 0) {
			this.edad = edad;
		}

		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	public boolean equals(Object f) {

		Futbolista futbol = (Futbolista) f;

		return this.numCamiseta == futbol.numCamiseta && this.nombre.equals(futbol.nombre);
	}

	/**
	 * Método que compara dos futbolistas por su número de camiseta y nombre.
	 * 
	 * @param futbol El futbolista con el que se compara.
	 * @return -1 si el futbolista es menor que el futbolista dado. 1 si el
	 *         futbolista es mayor. 0 si son iguales.
	 */
	@Override
	public int compareTo(Futbolista futbol) {
		int res = 0;

		if (this.numCamiseta < futbol.numCamiseta) {
			res = -1;
		} else if (this.numCamiseta > futbol.numCamiseta) {
			res = 1;
		} else {
			res = this.nombre.compareTo(futbol.nombre);
		}

		return res;
	}

	/**
	 * Método que devuelve las caracteristicas de cada Futbolista.
	 * 
	 * @return Una cadena que representa a un futbolista.
	 */
	@Override
	public String toString() {
		String cad;

		cad = "Futbolista --> " + "\n";
		cad += "Nº de camiseta: " + this.numCamiseta + "\n";
		cad += "Nombre: " + this.nombre + "\n";
		cad += "Edad: " + this.edad + "\n";
		cad += "Nº de goles: " + this.numGoles + "\n";
		return cad;
	}
}
