package ejercicio01;

public class Hora {

	private int minuto;
	private int hora;
	
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
	 * @param minutos
	 * @return
	 */
	boolean setMinutos(int minutos) {
		
		boolean esPosible = false;
		
		if(minutos < 60 && minutos >= 0) {
			
			minuto = minutos;
			
			esPosible = true;
		}

		return esPosible;
	}
	
	/**
	 * 
	 * @return
	 */
	boolean setHoras(int horas) {
		
		
		
	}
	
	
	
	
	

}
