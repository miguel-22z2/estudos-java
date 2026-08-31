package testes;

import java.math.BigDecimal;

public class ExercicioArray {
	public static void main(String[] args) {
		mostrarNome();
		String cute = mostrarNome2();
		System.out.println(cute);
		String cute2 = nomePersonalizado("Lorenzo");
		System.out.println(cute2);
		int s = soma(2, 4);
		System.out.println(s);
		BigDecimal b1 = new BigDecimal("0.1");
		BigDecimal b2 = new BigDecimal("0.2");
		System.out.println(b1.add(b2));
	}
	
	public static void mostrarNome() {
		System.out.println("Meu nome é Miguel!!!");
	}
	
	public static String mostrarNome2() {
		return "Meu nome é Cute Cute!!!";
	}
	
	public static String nomePersonalizado(String nome) {
		return "Olá " + nome + "!!!!";
	}
	
	public static int soma(int x, int y) {
		return x + y;
	}
}
