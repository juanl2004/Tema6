package ejercicio4;

public class PrincipalProducto {

	public static void main(String[] args) {
		// Crear un array de Electrodomesticos con una longitud de 10 posiciones.
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

		// Asignar objetos a cada posición del array con los valores deseados.
		electrodomesticos[0] = new Electrodomestico(100, "BLANCO", 'A', 20);
		electrodomesticos[1] = new Lavadora(150, "NEGRO", 'B', 30, 25);
		electrodomesticos[2] = new Television(200, "AZUL", 'C', 15, true, 40);
		electrodomesticos[3] = new Electrodomestico(250, "ROJO", 'D', 10);
		electrodomesticos[4] = new Lavadora(300, "GRIS", 'E', 40, 35);
		electrodomesticos[5] = new Television(400, "BLANCO", 'F', 25, false, 50);
		electrodomesticos[6] = new Electrodomestico(350, 20);
		electrodomesticos[7] = new Lavadora(450, 35);
		electrodomesticos[8] = new Television(500, "NEGRO", 'B', 30, true, 45);
		electrodomesticos[9] = new Electrodomestico(550, "AZUL", 'C', 15);

		// Recorrer el array y ejecutar el método precioFinal() para cada posición.
		double precioTotalElectrodomesticos = 0;
		double precioTotalLavadoras = 0;
		double precioTotalTelevisiones = 0;
		
		for (Electrodomestico electrodomestico : electrodomesticos) {
			// Calculamos el precio final y mostrar los resultados.
			double precioFinal = electrodomestico.precioFinal();
			System.out.println("Precio final del electrodoméstico: " + precioFinal);
			System.out.println("Precio base del electrodoméstico: " + electrodomestico.getPrecioBase());
			System.out.println("----------------------------------------------");

			// Verificamos el tipo de electrodomestico y actualizamos los precios totales.
			if (electrodomestico instanceof Lavadora) {
				precioTotalLavadoras += precioFinal;
			} else if (electrodomestico instanceof Television) {
				precioTotalTelevisiones += precioFinal;
			}

			precioTotalElectrodomesticos += precioFinal;
		}

		// Mostrar el precio total de cada clase.
		System.out.println("Precio total de electrodomésticos: " + precioTotalElectrodomesticos);
		System.out.println("");
		System.out.println("Precio total de lavadoras: " + precioTotalLavadoras);
		System.out.println("");
		System.out.println("Precio total de televisiones: " + precioTotalTelevisiones);
	}
}
