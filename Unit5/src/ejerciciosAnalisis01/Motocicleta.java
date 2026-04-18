package ejerciciosAnalisis01;

public class Motocicleta extends Vehiculo{

	private int cilindros;

	/**
	 * Constructor inicial
	 * @param cilindros
	 */
	public Motocicleta(int cilindros) {
		super();
		this.cilindros = cilindros;
		
	}
	
	/**
	 * Constructor general
	 * @param estadoMotor
	 * @param marchaActual
	 * @param velocidadInicial
	 * @param cilindros
	 */
	public Motocicleta(boolean estadoMotor, int marchaActual, int velocidadInicial, int cilindros) {
		super(estadoMotor, marchaActual, velocidadInicial);
		this.cilindros = cilindros;
		
	}
	
	//Getter y setter
	
	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	public boolean requiereCarner() {
		return cilindros <= 125;
		
	}
	
	
	@Override
	public void acelerar(int incremento) {
		velocidadActual += incremento * 2.0;
	}

	@Override
	public void frenar(int decremento) {
		velocidadActual -= decremento * 2.0;
		if(velocidadActual < 0) velocidadActual = 0;
	}
	

	
	
	
}
