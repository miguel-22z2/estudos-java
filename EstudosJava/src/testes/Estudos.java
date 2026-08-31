package testes;

import java.util.Scanner;

public class Estudos {
	public static void main(String[] args) {
		
		/*
		 * > 
		 * <
		 * >=
		 * <=
		 * ==
		 * &&
		 * ||
		 * !=
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a 1ª nota: ");
		double nota1 = teclado.nextDouble();
		System.out.println();
		System.out.print("Digite a 2ª nota: ");
		double nota2 = teclado.nextDouble();
		System.out.println();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7.0) {
			System.out.println("PARABÉNS!");
			System.out.println("VOCÊ PASSOU!");
			System.out.println(media);
		} else {
			System.out.println("VOCÊ REPROVOU!");
			System.out.println(media);
		}
		
		teclado.close();
	}
}
