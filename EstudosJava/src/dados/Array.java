package dados;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
		String frase = "1011";
		
		String[] palavras = frase.split(" ");
		
		System.out.println(Arrays.toString(palavras));
		
	}
}
