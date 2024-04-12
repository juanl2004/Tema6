package interfaces_2;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {
	int numCamiseta;
	String nombre = "";
	int edad;
	int numGoles;

	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (edad > 0) {
			{
			}
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
