package ejerciciosAnalisis01;

public abstract class Vehiculo implements Conducible {



	protected boolean estadoMotor;
	protected int marchaActual;
	protected double velocidadActual;
	
	/*
	 * Contructor inicial
	 */
	public Vehiculo() {
		this.estadoMotor = false;
		this.marchaActual = 0;
		this.velocidadActual = 0;
	}
	
	/**
	 * Constructor general
	 * @param estadoMotor
	 * @param marchaActual
	 * @param velocidadInicial
	 */
	public Vehiculo(boolean estadoMotor, int marchaActual, int velocidadInicial) {
		super();
		this.estadoMotor = estadoMotor;
		marchaActual = marchaActual;
		this.velocidadActual = velocidadInicial;
	}
	
	//Getters y setters
	
	public boolean getEstadoMotor() {
		return estadoMotor;
	}

	public void setEstadoMotor(boolean estadoMotor) {
		this.estadoMotor = estadoMotor;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public void setMarchaActual(int marchaActual) {
		marchaActual = marchaActual;
	}

	public double getVelocidadInicial() {
		return velocidadActual;
	}

	public void setVelocidadInicial(int velocidadInicial) {
		this.velocidadActual = velocidadInicial;
	}
	
	@Override
	public void arrancar() {
		estadoMotor = true;
		System.out.println("Motor encendido");
	}
	
	@Override 
	public void parar() {
		estadoMotor = false;
		marchaActual = 0;
		velocidadActual = 0;
		System.out.println("Motor apagado");
	}
	@Override
	public void subirMarcha() {
		if(marchaActual < 5) marchaActual++;
	}
	
	@Override 
	public void bajarMarcha() {
		if(marchaActual > 0) marchaActual--;
		
	}
	
	/**
	 * Metodo que nos permite ajustar la marcha actual dependiendo de la velocidad
	 */
	public void ajustarMarcha() {
	    if (velocidadActual < 30) marchaActual = 1;
	    else if (velocidadActual < 50) marchaActual = 2;
	    else if (velocidadActual < 70) marchaActual = 3;
	    else if (velocidadActual < 100) marchaActual = 4;
	    else marchaActual = 5;
	}
	
	/**
	 * Funcion que permite aumentar la velocidad del vehiculo
	 * @param incremento
	 */
	public abstract void acelerar(int incremento);
	
	/**
	 * Funcion que permite disminuir la velocidad del vehiculo
	 * @param decremento
	 */
	public abstract void frenar(int decremento);
	
	
}
