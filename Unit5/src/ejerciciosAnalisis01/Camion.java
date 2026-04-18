package ejerciciosAnalisis01;

public class Camion extends Vehiculo{
	
	private double pesoMaximo;
	private boolean mercanciaPeligrosa;
	
	public Camion(double pesoMaximo, boolean mercanciaPeligrosa) {
		super();
		this.mercanciaPeligrosa = mercanciaPeligrosa;
		this.pesoMaximo = pesoMaximo;
		
		
	}
	
	public Camion(boolean estadoMotor, int marchaActual, int velocidadInicial, double pesoMaximo, boolean mercanciaPeligrosa) {
		super(estadoMotor, marchaActual, velocidadInicial);
		this.mercanciaPeligrosa = mercanciaPeligrosa;
		this.pesoMaximo = pesoMaximo;
		
		
	}

	//Getters y setters
	
	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}

	@Override
	public void acelerar(int incremento) {
		velocidadActual += incremento * 0.5;
	}

	@Override
	public void frenar(int decremento) {
		velocidadActual -= decremento * 0.5;
		
		if(velocidadActual < 0) velocidadActual = 0;
	}
	

	
	
	
}
