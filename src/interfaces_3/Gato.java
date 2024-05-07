package interfaces_3;

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
	public Gato(String nombre, String raza, double peso, String color, boolean vacunado) {
		super(nombre, raza, peso, color, vacunado);
	}

	/**
	 * Método para simular el maullido de un gato
	 */
	@Override
	public void hacerRuido() {
		System.out.println(super.nombre + " maulla");
	}

	/**
	 * Método para simular el comportamiento de hacer caso de un gato.
	 * 
	 * @return true si el gato hace caso
	 * 		   false si el gato no hace caso.
	 */
	@Override
	public boolean hacerCaso() {
		return Math.random() * 100 <= 5;
	}

	/**
	 * Método que simula el maullido de un gato.
	 */
	public void toserBolaPelo() {
		System.out.println(super.nombre + " tose una bola de pelo");
	}
}
