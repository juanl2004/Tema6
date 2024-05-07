package ejercicio3;

/**
 * La clase Productos representa un producto con nombre y precio.
 */
public class Productos {
	private String nombre = "";
	private double precio;

	/**
	 * Constructor de la clase Productos con nombre y precio como parametros de
	 * entrada.
	 * 
	 * @param nombre El nombre del producto.
	 * @param precio El precio del producto.
	 */
	public Productos(String nombre, double precio) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Método para obtener el nombre del producto.
	 * 
	 * @return El nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para establecer el nombre del producto.
	 * 
	 * @param nombre El nuevo nombre del producto.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método para obtener el precio del producto.
	 * 
	 * @return El precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Método para establecer el precio del producto.
	 * 
	 * @param precio El nuevo precio del producto.
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Método para calcular el precio total de una serie de productos.
	 * 
	 * @param cantidad La cantidad de productos a calcular.
	 * @return El precio total de la cantidad de productos.
	 */
	public double calcular(int cantidad) {

		if (cantidad > 0) {
			precio *= cantidad;
		}
		return precio;
	}

	/**
	 * Método para obtiene una representación en forma de cadena del producto.
	 * 
	 * @return Una cadena que representa el producto con su nombre y precio.
	 */
	public String toString() {
		String productos = "";

		productos += "Nombre: " + nombre;
		productos += " Precio:" + precio;
		return productos;
	}

}
