package interfaces_3;

import java.util.Random;

/**
 * Clase que representa a un perro, que es un tipo de animal doméstico.
 */
public class Perro extends AnimalDomestico {

	/**
	 * Constructor con parametros de la clase Perro.
	 * 
	 * @param nombre El nombre del perro.
	 * @param raza   La raza del perro.
	 * @param peso   El peso del perro.
	 * @param color  El color del perro.
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Método para sacar a pasear al perro.
	 */
	public void sacarPaseo() {
		System.out.println("Sacar a pasear a " + getNombre());
	}

	/**
	 * Método para simular el ladrido de un perro.
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Guau Guau");
	}

	/**
	 * Método para simular el comportamiento de hacer caso de un perro.
	 * 
	 * @return true si el perro hace caso, false si no.
	 */
	@Override
	public boolean hacerCaso() {
		Random random = new Random();
		int probabilidad;
		probabilidad = random.nextInt(100);

		return probabilidad < 90; // Devuelve true con una probabilidad del 90%.
	}
}
