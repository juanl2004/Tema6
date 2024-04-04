package ejercicio3;

public class Principal_Productos {

	public static void main(String[] args) {
		Productos NoPerecedero = new NoPerecedero ("Fanta", 0.5, "refresco ");
		Productos perecedero = new Perecedero ("Pan", 0.25, 2);

		double precioFinal1 = NoPerecedero.calcular(5);
		double precioFinal2 = NoPerecedero.calcular(3);
		
		System.out.println(NoPerecedero);
		System.out.println("Precio final --> " + precioFinal1);

		System.out.println(perecedero);
		System.out.println("Precio final --> " + precioFinal2);
		
		System.out.println(NoPerecedero.getClass());
		System.out.println(perecedero.getClass());
		System.out.println(NoPerecedero.getClass().getName());
		System.out.println(perecedero.getClass().getName());
	}

}
