package ejercicio05;
	
/**
 * Clase Poligono que representa un poligono generico
 */
abstract class Poligono {

	protected int numeroLados;

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	@Override
	public String toString() {
		return "numeroLados del Poligono: " + numeroLados;
	}
	
	/**
	 * Metodo abstracto para calcular el area de los poligonos 
	 * @return area del poligono en cuestion
	 */
	abstract double calcularArea();
		

}
