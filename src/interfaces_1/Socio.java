package interfaces_1;

public class Socio implements Comparable<Socio> {

	private int id;
	private String nombre = "";
	private int edad;

	public Socio(int id, String nombre, int edad) {
		if (id > 0) {
			this.id = id;
		}

		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (edad > 0) {
			this.edad = edad;
		}
	}

	@Override
	public int compareTo(Socio o) {
		int res = 0;

		if (this.id < o.id) {
			res = -1;
		} else if (this.id > o.id) {
			res = 1;
		}
		return res;
	}

	public String toString() {
		String cad;

		cad = "Socio --> " + this.id + "\n";
		cad += "    Nombre: " + this.nombre + "\n";
		cad += "    Edad: " + this.edad + "\n";

		return cad;
	}
}
