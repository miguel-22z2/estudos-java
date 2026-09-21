package poo;

import java.util.ArrayList;
import java.util.List;

public class ListGatos {
	public static void main(String[] args) {
		
		List<Gato> gatos = new ArrayList<>();
		
		/*Gato gato = new Gato("Persa", "Aurora");
		
		gatos.add(gato);*/
		
		gatos.add(new Gato("Persa", "Aurora"));
		gatos.add(new Gato("Persa", "Dragão"));
		gatos.add(new Gato("Persa", "Maya"));
		gatos.add(new Gato("Persa", "Bred"));
		
		System.out.println(gatos.get(2).getNome());
		System.out.println(gatos.get(0).getNome());
		System.out.println();
		
		/*for (int i = 0; i < gatos.size(); i++) {
			System.out.println(gatos.get(i).getNome());
		}*/
		
		for (Gato gato : gatos) {
			System.out.println(gato.getNome());
		}
		
	}
}
