package interface01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Socio> lista = new ArrayList<>();
		
		Socio socio1 = new Socio(138,"Paco", 20);
		Socio socio2 = new Socio(128,"Miguel", 30);
		Socio socio3 = new Socio(8,"Rocio", 40);
		
		lista.add(socio1);
		lista.add(socio2);
		lista.add(socio3);
		
		System.out.println(socio1.compareTo(socio3));
		Collections.sort(lista);
		
	}
	
}
