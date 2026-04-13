package ejerciciosAnalisis01;

public abstract class Vehiculo {

	
	protected String marca;
	protected String modelo;
	protected String color;
	protected String matricula;
	protected boolean motorEncendido;
	protected int marcha;
	protected int velocidad;
	
	/**
	 * Constructor general
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param motorEncendido
	 * @param marcha
	 * @param velocidad
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula, boolean motorEncendido, int marcha,
			int velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.motorEncendido = motorEncendido;
		this.marcha = marcha;
		this.velocidad = velocidad;
	}
	
	//Getters and setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isMotorEncendido() {
		return motorEncendido;
	}
	public void setMotorEncendido(boolean motorEncendido) {
		this.motorEncendido = motorEncendido;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * Metodo abstracto para mostrar información del vehiculo
	 * @return informacion del vehiculo
	 */
	abstract String mostrarInfo();
	
	public void parar() {
		
		motorEncendido = false;
	}
	
	public void arrancar() {
		
		motorEncendido = true;
	}
	
	public void subirMarcha() {
		
		marcha++;
	}
	
	public void bajarMarcha() {
		
		marcha--;
	}
	
	

}
