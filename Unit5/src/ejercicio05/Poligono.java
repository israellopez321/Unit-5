package ejercicio05;

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
	
	abstract double calcularArea();
		

}
