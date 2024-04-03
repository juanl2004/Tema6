package Ejercicio3;

/**
 * La clase Perecedero representa un producto perecedero con nombre, precio y
 * días a caducar.
 */
public class Perecedero extends Productos {

	private int diasACaducar;

	/**
	 * Constructor con parametros de la clase Perecedero.
	 * 
	 * @param nombre       El nombre del producto.
	 * @param precio       El precio del producto.
	 * @param diasACaducar Los días a caducar del producto.
	 */
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	/**
	 * Método para obtener los días a caducar del producto.
	 * 
	 * @return Los días a caducar del producto.
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Método para establecer los días a caducar del producto.
	 * 
	 * @param diasACaducar Los nuevos días a caducar del producto.
	 */
	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	/**
	 * Método para calcular el precio total de una cantidad de productos
	 * perecederos.
	 * 
	 * @param cantidad La cantidad de productos a calcular.
	 * @return El precio total de la cantidad de productos perecederos.
	 */
	@Override
	public double calcular(int cantidad) {
		// Obtener el precio total de la superclase Productos
		double precioFinal = super.calcular(cantidad);

		if (diasACaducar == 1) {
			// Reducir el precio final dividiéndolo entre 4.
			precioFinal /= 4;
		} else if (diasACaducar == 2) {
			// Reducir el precio final dividiéndolo entre 3.
			precioFinal /= 3;
		} else if (diasACaducar == 3) {
			// Reducir el precio final a la mitad.
			precioFinal /= 2;
		}

		return precioFinal;
	}

	/**
	 * Método para obtener una representación en forma de cadena del producto
	 * perecedero.
	 * 
	 * @return Una cadena que representa el producto perecedero con los dias a
	 * caducar.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Dias a caducar: " + diasACaducar;
	}
}
