package ejercicio04;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		
		ArrayList<Electrodomestico> cartel = new ArrayList<>();
		
		Lavadora trevol = new Lavadora();
		Lavadora girasol = new Lavadora(100, 200);
		Television asus = new Television();
		Television samsung = new Television(55, true, 300, "blanco",'F', 100);
		
		cartel.add(trevol);
		cartel.add(girasol);
		cartel.add(asus);
		cartel.add(samsung);
		
		
		double sumaElectrodomestico = 0;
		for(Electrodomestico electro: cartel) {
			
			electro.precioFinal();
			System.out.println("Precio final: " + electro.getPrecio());
			
			sumaElectrodomestico += electro.getPrecio();
		}
		
		System.out.println("EL resultado final sera de " + sumaElectrodomestico + "€");
		
	}
	
}
