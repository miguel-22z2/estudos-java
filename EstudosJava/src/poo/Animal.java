package poo;

public class Animal {

	private String nome;
	private String especie;
	
	public void comer() {
		System.out.println("O animal está comendo...");
	}
	
	public void beber() {
		System.out.println("O animal está bebendo...");
	}
	
	public void reproduzirSom() {
		System.out.println("O animal tá fazendo som...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
