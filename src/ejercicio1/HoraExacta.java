package ejercicio1;

public class HoraExacta extends Hora {

	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (segundo > 0 && segundo < 60) {
			this.segundo = segundo;
		}
	}

	public boolean setSegundo(int valor) {
		boolean res = false;
		if (valor >= 0 && valor < 60) {
			res = true;
		}
		return res;
	}

	@Override
	public void inc() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		String horaCompleta;
		
		if (segundo < 10 && minuto < 10) {
			horaCompleta = hora + ":" + "0" + minuto + ":" + "0" + segundo;
		} else if (segundo < 10) {
			horaCompleta = hora + ":" + minuto + ":" + "0" + segundo;
		} else if (minuto < 10) {
			horaCompleta = hora + ":" + "0" + minuto + ":" + segundo;
		} else {
			horaCompleta = hora + ":" + minuto + "0" + segundo;
		}

		return horaCompleta;
	}
}
