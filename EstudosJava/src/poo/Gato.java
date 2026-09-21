package poo;

public class Gato extends Animal {
	
	private String nome;

	public Gato(String especie, String nome) {
		super(especie);
		this.nome = nome;
	}
	
	@Override
	public void comer() {
		System.out.println("O gato " + this.nome + " está comendo");
	}
	
	@Override
	public void beber() {
		System.out.println("O gato " + this.nome + " está bebendo");
	}
	
}
