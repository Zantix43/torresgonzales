package ejercicio50;

import java.util.Scanner;

public class ejercicio50 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int [] apuesta = new int [5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("ingresen sus apuesta: ");
			apuesta [i] = entrada.nextInt();
		 }
		for (int i = 0; i < (apuesta.length - 1); i++) {
			 
			for (int j = 0; j < (apuesta.length - i - 1) ; j++) {
			
				
				if (apuesta[j] > apuesta[j + 1]) {
				
					int temporal = apuesta[j];
					
					apuesta[j] = apuesta[j + 1];
					apuesta[j + 1] = temporal;
				}
			}	
		  }	
		
		System.out.println("la apuesta mas grande fue "+apuesta[4]+" y la apuesta mas pequeña fue "+apuesta[0]);          
		
		System.out.println("\nApuestas mayores a 500: ");
		
		for (int noset : apuesta) {
			if (noset < 500) {
				continue;
			}
			System.out.print(noset + " ");
		}
	}    
}		
		
		
	
		


