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
	 * 
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
	
	boolean setMinutos(int minutos) {
		
		
		return true;
	}
	
	
	
	
	
	
	

}
