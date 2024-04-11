package ejercicio5;

import java.util.Scanner;

/**
 * Esta clase representa main que permite al usuario interactuar con los
 * diferentes poligonos.
 */
public class PrincipalFiguras {

	private static Scanner sc = new Scanner(System.in);
	private static Lista lista = new Lista();

	/**
	 * Método principal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int opcion = 1;

		// Se muestra el menú y con el switch elegimos las diferentes opciones.
		while (opcion > 0 && opcion < 4) {
			menu();
			System.out.println();
			System.out.println("Elige una opción -->");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				crearTriangulo();
				break;
			case 2:
				crearRectangulo();
				break;
			case 3:
				lista.imprimirLista();
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inválida. Por favor, elige una opción válida.");
				break;
			}
		}

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Metodo que implementa el menú con las diferentes opciones.
	 */
	public static void menu() {
		System.out.println("---------- MENU ---------");
		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectángulo");
		System.out.println("3. Mostrar contenido del array");
	}

	/**
	 * Metodo que permite al usuario crear un triángulo ingresando los lados.
	 */
	public static void crearTriangulo() {
		System.out.println("Introduce los lados del triángulo:");
		System.out.print("Lado 1: ");
		int lado1 = sc.nextInt();
		System.out.print("Lado 2: ");
		int lado2 = sc.nextInt();
		System.out.print("Lado 3: ");
		int lado3 = sc.nextInt();
		lista.insertar(new Triangulo(lado1, lado2, lado3));
	}

	/**
	 * Metodo que permite al usuario crear un rectángulo ingresando los lados.
	 */
	public static void crearRectangulo() {
		System.out.println("Introduce los lados del rectángulo:");
		System.out.print("Lado 1: ");
		int lado1 = sc.nextInt();
		System.out.print("Lado 2: ");
		int lado2 = sc.nextInt();
		lista.insertar(new Rectangulo(lado1, lado2));
	}

}
