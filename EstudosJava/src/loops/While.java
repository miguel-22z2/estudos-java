package loops;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor = teclado.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(valor + " x " + i + " = " + (valor * i));
			
		}
		
		teclado.close();
		
	}
}
