package interfaces_1;

import java.util.Arrays;

/**
 * Clase principal en la que comprobaremos diferentes socios.
 */
public class MainSocio {

	/**
	 * Método principal para probar la clase Socio.
	 */
	public static void main(String[] args) {

		// Creación de un array de tipo Socio
		Socio[] socios = new Socio[3];

		// Creación de los objetos Socio.
		Socio socio1 = new Socio(10, "Elena", 40);
		Socio socio2 = new Socio(1, "Daniela", 18);
		Socio socio3 = new Socio(5, "Maria", 20);

		// Asignamos cada objeto a una posición del array.
		socios[0] = socio1;
		socios[1] = socio2;
		socios[2] = socio3;

		// Variable donde almacenar el valor que nos devuelve al comparar dos socios.
		int res;

		res = socio1.compareTo(socio3);
		System.out.println("Comparación entre socio 1 y socio 3: " + res);

		res = socio2.compareTo(socio3);
		System.out.println("Comparación entre socio 2 y socio 3: " + res + "\n");

		// Ordenamos el array de socios.
		Arrays.sort(socios);

		// Imprimimos los socios ordenados.
		System.out.println("Socios ordenados:");
		for (Socio socio : socios) {
			System.out.println(socio);
		}
	}
}
