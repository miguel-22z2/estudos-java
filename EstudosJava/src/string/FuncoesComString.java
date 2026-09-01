package string;

public class FuncoesComString {
	public static void main(String[] args) {
		
		String nome = "Mayara";
		
		System.out.println(nome.charAt(2));
		
		System.out.println(nome.length());
		
		String nome2 = "Mayara";
		
		if (nome.equals(nome2)) {
			System.out.println("É igual");
		} else {
			System.out.println("Não é");
		}
		
		System.out.println(nome.replaceAll("m", ""));
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		
		System.out.println(nome.isBlank());
		
	}
}
