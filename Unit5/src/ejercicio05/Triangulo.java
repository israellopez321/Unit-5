package ejercicio05;

/**
 * Clase Triangulo que hereda de la clase Poligono que representa un triangulo generico con sus tres lados
 */
class Triangulo extends Poligono{

	
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * Contructor general
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public String toString() {
		return "Triangulo --> lado1:" + lado1 + ", lado2:" + lado2 + ", lado3:" + lado3;
	}
	
	/**
	 * Metodo que permite calcular el area de un triángulo mediante la formula de Heron
	 */
	public double calcularArea(){
		double semiperimetro = (lado1 + lado2 + lado3) / 2.0;
		double resultado = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
		
		return resultado;
	}
	
}
