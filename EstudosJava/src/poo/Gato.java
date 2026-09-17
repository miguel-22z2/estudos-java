package poo;

public class Gato extends Animal {

	@Override
	public void comer() {
		this.setNome("Apolo");
		System.out.println("O gato " + this.getNome() + " está comendo");
	}
	
	@Override
	public void beber() {
		this.setNome("Apolo");
		System.out.println("O gato " + this.getNome() + " está bebendo");
	}
	
}
