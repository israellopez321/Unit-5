package ejercicio05;

/**
 * Clase Rectangulo que hereda de la clase poligono que representa un rectangulo generico con sus lados
 */
class Rectangulo extends Poligono{

	private double lado1;
	private double lado2;
	
	/**
	 * Contructor general
	 * @param lado1
	 * @param lado2
	 */
	public Rectangulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//Getters and setters
	
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		return "Rectángulo --> lado1:" + lado1 + ", lado2:" + lado2;
	}
	
	/**
	 * Metodo para calcular el area de un rectangulo
	 */
	public double calcularArea() {
		
		return lado1 * lado2;
		
	}
	
	

}
