package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
	
		iniciar();
		
	}
	
	/**
	 * Funcion que permite iniciar el programa
	 */
	public static void iniciar() {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Poligono> lista = new ArrayList<>();
		
		
		int opcion = 0;
		
		do {
			
			System.out.println("--Menu de inicio--");
			System.out.println("1. Introducir triángulo");
			System.out.println("2. Introducir rectángulo");
			System.out.println("3. Mostrar polígono");
			System.out.println("4. Salir del programa");
			System.out.print("Introduzca un opcion: ");
			
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			
			case 1:
				
				System.out.print("Introduce el primer lado del triángulo: ");
				double lado1 = sc.nextDouble();
				
				System.out.print("Introduce el segundo lado del triángulo: ");
				double lado2 = sc.nextDouble();
				
				System.out.print("Introduce el tercer lado del triángulo: ");
				double lado3 = sc.nextDouble();
				
				Triangulo tri = new Triangulo(lado1, lado2, lado3);
				
				lista.add(tri);
				
				break;
			case 2:
				
				System.out.print("Introduce el primer lado del rectángulo:");
				lado1 = sc.nextDouble();
				
				System.out.print("Introduce el segundo lado del rectángulo:");
				lado2 = sc.nextDouble();
				
				Rectangulo rec = new Rectangulo(lado1, lado2);
				
				lista.add(rec);
				
				break;
			case 3:
				
				for (Poligono polig: lista) {
					
					System.out.println(polig);
					System.out.println("Area: " + polig.calcularArea());
					
				}
				
				break;
			case 4:
				System.out.println("Cerrando programa");
				
				break;
			default:
				System.out.println("Esa opcion no existe");
			
			}
			
		}while(opcion != 4);
		
		sc.close();
	}
	
	
}
