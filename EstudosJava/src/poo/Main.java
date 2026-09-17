package poo;

public class Main {
	public static void main(String[] args) {
		
		Animal animalGenerico = new Animal();
		Gato apolo = new Gato();
		
		// Método comer()
		animalGenerico.comer();
		apolo.comer();
		System.out.println();
		
		// Método beber()
		animalGenerico.beber();
		apolo.beber();
		
	}
}
