package loops;

public class Recursao {
	
	public static void main(String[] args) {
		
		regressivaRecursiva(10);
		
		long fat = fat(5);
		
		System.out.println(fat);
		
	}
	
	public static void regressivaRecursiva(int valor) {
		
		if (valor <= 0) {
			return;
		}
		
		System.out.println(valor);
		
		regressivaRecursiva(valor - 1);
		
	}
	
	public static long fat(long valor) {
		
		long resultado = valor;
		
		if (valor > 1) {
			resultado *= fat(valor - 1);
		}
		
		return resultado;
		
	}
	
}
