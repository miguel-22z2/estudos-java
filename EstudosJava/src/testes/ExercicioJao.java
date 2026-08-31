package testes;

import java.util.Arrays;
import java.util.Random;

public class ExercicioJao {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		Random r = new 	Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(100) + 1;
		}
		
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println(array[8]);
	}
}