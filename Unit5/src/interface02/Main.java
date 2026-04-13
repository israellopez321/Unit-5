package interface02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Futbolista> lista = new ArrayList<>();
		
		Futbolista persona1 = new Futbolista(2, "Iker", 23, 2);
		Futbolista persona2 = new Futbolista(13, "Gonzalo", 23, 1);
		Futbolista persona3 = new Futbolista(23, "Manuel", 23, 5);
		Futbolista persona4 = new Futbolista(13, "Paco", 23, 6);
		
		lista.add(persona1);
		lista.add(persona3);
		lista.add(persona4);
		lista.add(persona2);
		
		Collections.sort(lista);
		
		for(Futbolista persona: lista) {
			
			System.out.println(persona);
		}
	}

}
