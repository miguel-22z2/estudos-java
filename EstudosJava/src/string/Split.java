package string;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		
		String expressao = "5 + 2";
		
		String[] valoresExpressao = expressao.split(" ");
		
		System.out.println(Arrays.toString(valoresExpressao));
		
		Integer valorAnterior = Integer.parseInt(valoresExpressao[0]);
		Integer valorPosterior = Integer.parseInt(valoresExpressao[2]);
		
		System.out.println(valorAnterior + valorPosterior);
		
	}
}
