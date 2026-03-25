package ejercicio01;

public class Hora {

	protected int minuto;
	protected int hora;
	
	/**
	 * Contructor inicial
	 * @param minuto
	 * @param hora
	 */
	public Hora(int minuto, int hora) {
		super();
		if(minuto < 60 && minuto >= 0 && hora < 24 && hora >= 0) {
			this.minuto = minuto;
			this.hora = hora;
		}

	}
	
	public int getMinuto() {
		return minuto;
	}


	public int getHora() {
		return hora;
	}

	
	/**
	 * Funcion para incrementar los minutos en uno
	 */
	void inc() {	
		minuto++;
		if(minuto == 60) {
			minuto = 0;
			hora++;
		}
		if(hora == 24) {	
			hora = 0;	
		}		
	}
	
	/**
	 * Funcion para cambiar los minutos de la hora
	 * @param minuto
	 * @return
	 */
	public boolean setMinuto(int minuto) {
		
		boolean esPosible = false;
		
		if(minuto < 60 && minuto >= 0) {
			
			this.minuto = minuto;
			
			esPosible = true;
		}

		return esPosible;
	}
	
	/**
	 * Funcion para cambiar las horas de la hora
	 * @return
	 */
	public boolean setHora(int hora) {
		
		boolean esPosible = false;
		
		if (hora < 24 && hora >= 0) {
			this.hora = hora;
			esPosible = true;
		}
		
		return esPosible;
	}

	@Override
	public String toString() {
		return hora + ":" + minuto;
	}
	
	
	
	
	

}
