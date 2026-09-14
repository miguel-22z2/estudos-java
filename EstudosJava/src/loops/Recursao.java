package loops;

public class Recursao {
	
	public static void main(String[] args) {
		
		regressiva(10);
		
		System.out.println();
		
		System.out.println(fat(5));
		
	}
	
	public static void regressiva(int valor) {
		
		if (valor < 0) {
			return;
		}
		
		System.out.println(valor);
		
		regressiva(valor - 1);
		
	}
	
	public static long fat(long valor) {
		
		long resultado = valor;
		
		if (valor > 1) {
			resultado *= fat(valor - 1);
		}
		
		return resultado;
		
	}
	
}
