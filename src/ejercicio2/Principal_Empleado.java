package ejercicio2;

public class Principal_Empleado {

	public static void main(String[] args) {
		
		//Crear objetos de diferentes tipos de empleados.
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
	
		 // Imprimir información sobre cada empleado
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
	}	
	
}
