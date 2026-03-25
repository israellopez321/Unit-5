package ejercicio01;

class HoraExacta extends Hora{

	public HoraExacta(int minuto, int hora, int segundos) {
		super(minuto, hora);
		
		if(segundos >= 0 && segundos < 60) {
			this.segundos = segundos;
		}
	}
	
	
	protected int segundos;

	//Getters y setters
	
	public int getSegundos() {
		return segundos;
	}


	public boolean setSegundos(int segundos) {
		
		boolean esPosible = false;
		
		if(segundos >= 0 && segundos < 60){
			this.segundos = segundos;
			
			esPosible = true;
		}
		
		return esPosible;
	}
	
	
	void inc() {	
		segundos++;
		
		if(segundos == 60) {
			segundos = 0;
			minuto++;
		}
		
		if(minuto == 60) {
			minuto = 0;
			hora++;
		}
		if(hora == 24) {	
			hora = 0;	
		}		
	}


	@Override
	public String toString() {
		return hora + ":" + minuto + ":" + segundos;
	}
	
	
	
}
