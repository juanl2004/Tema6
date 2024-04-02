package ejercicio1;

/**
 * La clase HoraExacta extiende la clase Hora y representa una hora compuesta
 * por la hora, los minutos y los segundos.
 */
public class HoraExacta extends Hora {

	/**
	 * Representa los segundos.
	 */
	private int segundo;

	/**
	 * Constructor con parametros de la clase HoraExacta.
	 * 
	 * @param hora    --> la hora pasada como parametro.
	 * @param minuto  --> los minutos pasados como parametros.
	 * @param segundo --> los segundos pasados como parametros.
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		}
	}

	/**
	 * Este metodo nos dice si se puedes asignar un valor que nosotros pasemos a los
	 * segundos.
	 * 
	 * @param valor --> El número de segundos que asignemos.
	 * @return True --> Si se pueden modificar los segundos. False --> Si no se han
	 *         podido midificar los segundos.
	 */
	public boolean setSegundo(int valor) {
		boolean res = false;
		if (valor >= 0 && valor < 60) {
			this.segundo = valor;
			res = true;
		}
		return res;
	}

	/**
	 * Metodo que se encarga de incrementar la hora en un segundo. Hace uso del
	 * método inc() de la clase Hora.
	 */
	@Override
	public void inc() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
		}
	}

	/**
	 * Este metodo devuelve una representación en forma de cadena de la hora exacta
	 * en formato "hora:minutos:segundos".
	 * 
	 * @return una cadena que representa la hora exacta.
	 */
	@Override
	public String toString() {
		String horaCompleta = super.toString();

		if (segundo < 10) {
			horaCompleta += ":0" + segundo;
		} else {
			horaCompleta += ":" + segundo;
		}

		return horaCompleta;
	}
}
