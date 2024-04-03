package Ejercicio3;

/**
 * La clase NoPerecedero representa un producto no perecedero con nombre, precio
 * y tipo.
 */
public class NoPerecedero extends Productos {
	private String tipo;

	/**
	 * Constructor con parametros de la clase NoPerecedero.
	 * 
	 * @param nombre El nombre del producto.
	 * @param precio El precio del producto.
	 * @param tipo   El tipo del producto.
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	/**
	 * Método para obtener el tipo del producto no perecedero.
	 * 
	 * @return El tipo del producto.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método para establecer el tipo del producto no perecedero.
	 * 
	 * @param tipo El nuevo tipo del producto.
	 */
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	/**
	 * Método para obtener una representación en forma de cadena del producto no
	 * perecedero.
	 * 
	 * @return Una cadena que representa el producto no perecedero con el tipo.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Tipo: " + tipo;
	}
}
