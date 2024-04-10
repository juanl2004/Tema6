package ejercicio5;

import java.util.Scanner;

public class PrincipalFiguras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Poligono[] poligonos = new Poligono[10];

		int opcion = 1;
		int contador = 0;

		while (opcion > 0 && opcion < 4) {
			menu();
			System.out.println();
			System.out.println("Elige una opción -->");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				crearTriangulo(poligonos, contador, sc);
				contador++;
				break;
			case 2:
				crearRectangulo(poligonos, contador, sc);
				contador++;
				break;
			case 3:
				mostrarContenido(poligonos, contador);
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inválida. Por favor, elige una opción válida.");
				break;
			}
		}

		sc.close();
	}

	public static void menu() {
		System.out.println("---------- MENU ---------");
		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectángulo");
		System.out.println("3. Mostrar contenido del array");

	}

	public static void crearTriangulo(Poligono[] poligonos, int contador, Scanner sc) {
		System.out.println("Introduce los lados del triángulo:");
		System.out.print("Lado 1: ");
		int lado1 = sc.nextInt();
		System.out.print("Lado 2: ");
		int lado2 = sc.nextInt();
		System.out.print("Lado 3: ");
		int lado3 = sc.nextInt();
		poligonos[contador] = new Triangulo(3, lado1, lado2, lado3);
	}

	public static void crearRectangulo(Poligono[] poligonos, int contador, Scanner sc) {
		System.out.println("Introduce los lados del rectángulo:");
		System.out.print("Lado 1: ");
		int lado1 = sc.nextInt();
		System.out.print("Lado 2: ");
		int lado2 = sc.nextInt();
		poligonos[contador] = new Rectangulo(4, lado1, lado2);
	}

	public static void mostrarContenido(Poligono[] poligonos, int contador) {
		if (contador == 0) {
			System.out.println("No hay figuras almacenadas en el array.");

		} else {
			System.out.println("Contenido del array:");
			for (int i = 0; i < contador; i++) {
				System.out.println(poligonos[i]);
				if (poligonos[i] instanceof Triangulo) {
					Triangulo triangulo = (Triangulo) poligonos[i];
					System.out.println("Área del triángulo: " + triangulo.area());
				} else if (poligonos[i] instanceof Rectangulo) {
					Rectangulo rectangulo = (Rectangulo) poligonos[i];
					System.out.println("Área del rectángulo: " + rectangulo.area());
				}
				System.out.println();
			}
		}
	}

}