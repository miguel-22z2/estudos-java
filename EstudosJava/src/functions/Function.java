package functions;

public class Function {
	
	public static void ola(String nome) {
		
		System.out.println("Olá!, " + nome);
		
	}
	
	public static Integer soma(Integer n1, Integer n2) {
		return n1 + n2;
	}
	
	public static void main(String[] args) {
		
		ola("Mayara");
		
		Integer soma = soma(5, 2);
		
		System.out.println(soma);
		
	}
	
}
