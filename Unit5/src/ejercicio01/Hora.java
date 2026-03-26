package ejercicio01;

public class Hora {

	protected int minuto;
	protected int hora;
	
	/**
	 * Contructor inicial
	 * @param minuto
	 * @param hora
	 */
	public Hora(int hora, int minuto) {
		
		if(minuto < 60 && minuto >= 0) {
			this.minuto = minuto;		
		} else {
			throw new IllegalArgumentException("ERROR: los minutos debe estar comprendida entre 0 y 59");
		}
		
		if(hora < 24 && hora >= 0) {
			this.hora = hora;
		} else {
			throw new IllegalArgumentException("ERROR: la hora debe estar comprendida entre 0 y 24");
			
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
