package ejercicio1;

/**
 * La clase hora representa una hora compuesta por las horas y los minutos.
 */
public class Hora {
	/**
	 * Representa la hora.
	 */
	protected int hora;
	/**
	 * Representa los minutos.
	 */
	protected int minuto;

	/**
	 * Constructor con parametros de la clase Hora.
	 * 
	 * @param hora   --> la hora pasada como parametro.
	 * @param minuto --> los minutos pasados como parametros.
	 */
	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}

		if (minuto > 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}

	/**
	 * Metodo que se encarga de incrementar la hora en un minuto.
	 */
	public void inc() {
		minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora++;
		}

		if (hora == 24) {
			hora = 0;
		}
	}

	/**
	 * Este metodo nos dice si se puedes asignar un valor que nosotros pasemos a los
	 * minutos.
	 * 
	 * @param valor --> El número de minutos que asignemos.
	 * @return True --> Si se pueden modificar los minutos. False --> Si no se han
	 *         podido midificar los minutos.
	 */
	public boolean setMinutos(int valor) {
		boolean res = false;

		if (valor >= 0 && valor < 60) {
			this.minuto = valor;
			res = true;
		}
		return res;
	}

	/**
	 * Este metodo nos dice si se puedes asignar un valor que nosotros pasemos a las
	 * horas.
	 * 
	 * @param valor --> El número de horas que asignemos.
	 * @returnTrue --> Si se pueden modificar las horas. False --> Si no se han
	 *             podido midificar las horas.
	 */
	public boolean setHora(int valor) {
		boolean res = false;

		if (valor >= 0 && valor < 24) {
			this.hora = valor;
			res = true;
		}
		return res;
	}

	/**
	 * Este metodo devuelve una representación en forma de cadena de la hora en
	 * formato "hora:minutos".
	 * 
	 * @return cadena que representa la hora.
	 */
	@Override
	public String toString() {
		String horaCompleta;

		if (hora < 10) {
			horaCompleta = "0" + hora + ":";
		} else {
			horaCompleta = hora + ":";
		}

		if (minuto < 10) {
			horaCompleta += "0" + minuto;
		} else {
			horaCompleta += minuto;
		}

		return horaCompleta;
	}
}