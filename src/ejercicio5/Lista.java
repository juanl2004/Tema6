package ejercicio5;

/**
 * Esta clase representa una lista de polígonos.
 */
public class Lista {

	// Array para almacenar los polígonos.
	Poligono[] lista = new Poligono[10];
	
	// Contador para recorrer y contabilizar el número de polígonos en la lista.
	int contador = 0;

	/**
	 * Inserta un polígono en la lista.
	 * 
	 * @param p El polígono a insertar.
	 */
	public void insertar(Poligono p) {
		// Inserta el polígono en la posición actual del contador.
		this.lista[contador] = p; 
		// Incrementa el contador para la próxima inserción.
		contador++; 
	}

	/**
	 * Imprime la lista de polígonos.
	 */
	public void imprimirLista() {
	    // Bucle for para recorrer cada elemento de la lista.
	    for (Poligono p : lista) { 
	        // Comprobamos si el elemento no es nulo.
	        if (p != null) { 
	            System.out.println(p);
	            if (p instanceof Triangulo) {
	                Triangulo triangulo = (Triangulo) p;
	                System.out.println("Área del triángulo: " + triangulo.area());
	            } else if (p instanceof Rectangulo) {
	                Rectangulo rectangulo = (Rectangulo) p;
	                System.out.println("Área del rectángulo: " + rectangulo.area());
	            }
	            System.out.println(); // Salto de línea para separar cada polígono.
	        }
	    }
	}
}
