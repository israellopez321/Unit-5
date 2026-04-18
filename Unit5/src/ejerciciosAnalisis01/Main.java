package ejerciciosAnalisis01;

public class Main {

	public static void main(String[] args) {
		
		Turismo coche = new Turismo(5, Turismo.tipoUso.particular );
		
		simularConduccion(coche, 120, 20);
	}
	
	
	public static void simularConduccion(Turismo coche, double velocidadObjetivo, int tiempoMantener) {

	    System.out.println("Coche en reposo...");
	    coche.arrancar();

	    // Acelerar hasta velocidad objetivo
	    while (coche.velocidadActual < velocidadObjetivo) {
	        coche.acelerar(5);
	        coche.ajustarMarcha();
	        System.out.println("Velocidad: " + coche.velocidadActual + " km/h | Marcha: " + coche.marchaActual);
	    }

	    // Mantener velocidad
	    System.out.println("Manteniendo velocidad...");
	    try {
	        Thread.sleep(tiempoMantener * 1000);
	    } catch (InterruptedException e) {}

	    // Desacelerar
	    while (coche.velocidadActual > 0) {
	        coche.frenar(5);
	        coche.ajustarMarcha();
	        System.out.println("Velocidad: " + coche.velocidadActual + " km/h | Marcha: " + coche.marchaActual);
	    }

	    coche.marchaActual = 0; // punto muerto
	    coche.parar();
	}
}


