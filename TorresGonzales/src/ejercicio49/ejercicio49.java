package ejercicio49;

import java.util.Scanner;

public class ejercicio49 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int [] dni = new int [5];
		
	  for (int nose = 0; nose < 5; nose++) {
		 System.out.println("ingrese el "+(nose+1)+" numero de dni: ");
	   dni [nose] = entrada.nextInt();
	  }
	  
	  for (int i = 0; i < (dni.length - 1) ; i++) {
			 
			for (int j = 0; j < (dni.length - i - 1) ; j++) {
			
				
				if (dni[j] > dni[j + 1]) {
					int temporal = dni[j];
					
					dni[j] = dni[j + 1];
					dni[j + 1] = temporal;
				}
			}
		}
	  System.out.println("ascendente: ");
	  for (int i = 0; i < dni.length; i++) {
			System.out.print(dni[i] + " ");
		}
	  
	  // orden descendente
	  
	  System.out.println("\n decendente: ");
	  for (int i = dni.length-1; i > 0 ; i--) {
			System.out.print(dni[i] + " ");
		}
	}
}
