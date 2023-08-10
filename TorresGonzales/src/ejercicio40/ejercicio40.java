package ejercicio40;

import java.util.Scanner;

public class ejercicio40 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

	    float promedio = 0,div;
	    
		int [] nose = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("ingrese la temperatura n"+(i+1));
			nose[i] = entrada.nextInt();
			
			promedio += nose[i];
		}		
		System.out.println("el promedio es: "+promedio/5);
	}
}
