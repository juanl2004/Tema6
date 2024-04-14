package interfaces_3;

import java.util.Random;

/**
 * Clase que representa a un gato, que es un tipo de animal doméstico.
 */
public class Gato extends AnimalDomestico {

	/**
	 * Constructor con parametros de la clase Gato.
	 * 
	 * @param nombre El nombre del gato.
	 * @param raza   La raza del gato.
	 * @param peso   El peso del gato.
	 * @param color  El color del gato.
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Método para simular el acto de toser una bola de pelo.
	 */
	public void toserBolaPelo() {
		System.out.println("El gato está tosiendo una bola de pelo");
	}

	/**
	 * Método para simular el maullido de un gato.
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Miau Miau");
	}

	/**
	 * Método para simular el comportamiento de hacer caso de un gato.
	 * 
	 * @return true si el gato hace caso, false si no.
	 */
	@Override
	public boolean hacerCaso() {
		Random random = new Random();
		int probabilidad;
		probabilidad = random.nextInt(100);

		return probabilidad < 5; // Devuelve true con una probabilidad del 5%.
	}
}
