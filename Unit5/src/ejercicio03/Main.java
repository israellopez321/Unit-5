package ejercicio03;

public class Main {

	

	public static void main(String[] args) {
		
		Productos productoUno = new Productos("pecera", 12);
		
		Perecedero productoDos = new Perecedero("platano", 12, 2);
		
		NoPerecedero productoTres = new NoPerecedero("piedra", 12, "duro");
		
		System.out.println(productoUno.calcular(4));
		
		System.out.println(productoDos.calcular(4));
		
		System.out.println(productoTres.calcular(4));
		
	}
}
