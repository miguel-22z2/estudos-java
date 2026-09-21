package poo;

public class Cachorro extends Animal {

	private String nome;

	public Cachorro(String especie, String nome) {
		super(especie);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void comer() {
		System.out.println("O cachorro " + this.nome + " está comendo");
	}
	
	@Override
	public void beber() {
		System.out.println("O cachorro " + this.nome + " está bebendo");
	}

}
