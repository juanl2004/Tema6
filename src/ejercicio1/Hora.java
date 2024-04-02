package ejercicio1;

public class Hora {
	protected int hora;
	protected int minuto;

	public Hora(int hora, int minuto) {
		if (hora > 0 && hora < 24) {
			this.hora = hora;
		}

		if (minuto > 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}

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

	public boolean setMinutos(int valor) {
		boolean res = false;
		if (valor >= 0 && valor < 60) {
			res = true;
		}
		return res;
	}

	public boolean setHora(int valor) {
		boolean res = false;
		if (valor >= 0 && valor < 24) {
			res = true;
		}
		return res;
	}
	
	@Override
	public String toString() {
		String horaCompleta;

		if (minuto < 10) {
			horaCompleta = hora + ":" + "0" + minuto;
		} else {
			horaCompleta = hora + ":" + minuto;
		}

		return horaCompleta;
	}
}