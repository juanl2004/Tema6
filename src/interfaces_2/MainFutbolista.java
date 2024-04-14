package interfaces_2;

import java.util.Arrays;

import interfaces_1.Socio;

/**
 * Clase main para probar si los futbolistas son iguales.
 */
public class MainFutbolista {

	/**
	 * Método principal para probar la funcionalidad de la clase Futbolista.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creación de un array de tipo Futbolista, de tamaño 5 para almacenar cada uno
		// de los futbolistas.
		Futbolista[] futbolistas = new Futbolista[5];

		// Creamos los objetos Futbolista y les damos unas caracteristicas a cada uno.
		Futbolista futbolista1 = new Futbolista(10, "Cristiano Ronaldo", 34, 100);
		Futbolista futbolista2 = new Futbolista(7, "Robert Lewandowski", 36, 200);
		Futbolista futbolista3 = new Futbolista(10, "Cristiano Ronaldo", 29, 150);
		Futbolista futbolista4 = new Futbolista(9, "Lionel Messi", 33, 75);
		Futbolista futbolista5 = new Futbolista(20, "Kevin De Bruyne", 30, 125);

		// Le asignamos al array cada uno de los futbolistas.
		futbolistas[0] = futbolista1;
		futbolistas[1] = futbolista2;
		futbolistas[2] = futbolista3;
		futbolistas[3] = futbolista4;
		futbolistas[4] = futbolista5;

		// Variable donde almacenar el valor que nos devuelve al comparar dos
		// futbolistas.
		int res;

		res = futbolista1.compareTo(futbolista2);
		System.out.println("Comparación entre futbolista1 y futbolista2: " + res);

		res = futbolista2.compareTo(futbolista3);
		System.out.println("Comparación entre futbolista2 y futbolista3: " + res);

		res = futbolista1.compareTo(futbolista3);
		System.out.println("Comparación entre futbolista2 y futbolista3: " + res + "\n");

		// Ordenación del array de futbolistas
		Arrays.sort(futbolistas);

		// Imprimimos los futbolistas ordenados
		System.out.println("Futbolistas ordenados:");
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
	}
}