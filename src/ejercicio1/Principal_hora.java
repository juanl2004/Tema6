package ejercicio1;

/**
 * La clase Principal_hora contiene el método main que realiza pruebas con las
 * clases Hora y HoraExacta.
 */
public class Principal_hora {

	/**
	 * Método principal que realiza pruebas con las clases Hora y HoraExacta.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Se crea un objeto de la clase Hora con hora 15 y minutos 59.
		Hora hora = new Hora(15, 59);
		// Se imprime la hora actual
		System.out.println("Hora actual: " + hora);

		// Se incrementa la hora en un minuto.
		hora.inc();
		// Se imprime la hora después del incremento.
		System.out.println("Después de incrementar la hora: " + hora);

		System.out.println();

		// Intentar establecer nuevos valores para la hora y los minutos.
		if (hora.setHora(20)) {
			// Si se logra, se imprime la hora actualizada.
			System.out.println("Hora actualizada: " + hora);
		} else {
			// Si no se logra, se imprime un mensaje de error.
			System.out.println("No se pudo actualizar la hora.");
		}

		// Se intenta establecer los minutos a 45.
		if (hora.setMinutos(45)) {
			// Si se logra, se imprime la hora actualizada.
			System.out.println("Minutos actualizados: " + hora);
		} else {
			// Si no se logra, se imprime un mensaje de error.
			System.out.println("No se pudo actualizar los minutos.");
		}

		System.out.println();

		// Se crea un objeto de la clase HoraExacta con hora 10, minutos 59 y segundos
		// 59.
		HoraExacta horaExacta = new HoraExacta(10, 59, 59);
		// Se imprime la hora exacta actual.
		System.out.println("Hora exacta actual: " + horaExacta);

		// Se incrementa la hora exacta en un segundo.
		horaExacta.inc();
		// Se imprime la hora exacta después del incremento.
		System.out.println("Después de incrementar la hora exacta: " + horaExacta);

		System.out.println();

		// Se intenta establecer los segundos a 55
		if (horaExacta.setSegundo(55)) {
			// Si se logra, se imprime la hora exacta actualizada.
			System.out.println("Segundos actualizados: " + horaExacta);
		} else {
			// Si no se logra, se imprime un mensaje de error.
			System.out.println("No se pudo actualizar los segundos.");
		}
	}
}