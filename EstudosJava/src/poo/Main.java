package poo;

public class Main {
	public static void main(String[] args) {
		
		Animal animal1 = new Gato("Persa", "Apolo");
		Animal animal2 = new Cachorro("Labrador", "Bob");
		Animal animal3 = new Cachorro("Husky", "Ayla");
		
		animal1.comer();
		System.out.println();
		animal2.beber();
		System.out.println();
		animal3.comer();
		
	}
}
