package Ejercicio3;

public class Productos {
	private String nombre = "";
	private double precio;

	public Productos(String nombre, double precio) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	public double calcular(int cantidad) {
		
		if (cantidad > 0) {
			precio *= cantidad;
		}
		return precio;
	}
	
	public String toString() {
		String productos = "";
		
		productos += "Nombre: " + nombre;
		productos += "Precio:" + precio;
		return productos;
	}
	
}
