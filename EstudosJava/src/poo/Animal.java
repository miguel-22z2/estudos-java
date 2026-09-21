package poo;

public class Animal {

	private String especie;

	public Animal(String especie) {
		super();
		this.especie = especie;
	}

	public void comer() {
		System.out.println("O animal está comendo...");
	}

	public void beber() {
		System.out.println("O animal está bebendo...");
	}

	public void reproduzirSom() {
		System.out.println("O animal tá fazendo som...");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
