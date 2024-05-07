package interfaces_3;

/**
 * Clase que representa a un perro, que es un tipo de animal doméstico.
 */
public class Perro extends AnimalDomestico {

	/**
	 * Constructor con parametros de la clase Perro.
	 * 
	 * @param nombre   El nombre del perro.
	 * @param raza     La raza del perro.
	 * @param peso     El peso del perro.
	 * @param color    El color del perro.
	 * @param vacunado Si el perro esta vacunado o no.
	 */
	public Perro(String nombre, String raza, double peso, String color, boolean vacunado) {
		super(nombre, raza, peso, color, vacunado);
	}

	/**
	 * Método que simula el comportamiento de hacer caso de un perro
	 * 
	 * @return true si el perro hace caso.
	 * 		   false si el perro no hace caso.
	 */
	@Override
	public boolean hacerCaso() {
		return Math.random() * 100 <= 90;
	}

	/**
	 * Método que simula el ladrido de un perro.
	 */
	@Override
	public void hacerRuido() {
		System.out.println(super.nombre + " ladra");
	}

	/**
	 * Método para sacar a pasear el perro.
	 */
	public void sacarPaseo() {
		System.out.println(super.nombre + " sale de paseo");
	}

}
