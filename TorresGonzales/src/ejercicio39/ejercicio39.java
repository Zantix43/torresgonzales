package ejercicio39;

import java.util.Scanner;

public class ejercicio39 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] nombre = new String[11];
		int [] edad = new int[11];
		
		for(int juga = 0; juga < 11; juga++) {
			System.out.println("ingrese nombre del jugador: ");
			nombre[juga] = entrada.next();
			System.out.println("ingrese edad del jugador: ");
			edad[juga] = entrada.nextInt();
		}
		
		System.out.println("\n ");
		
		for(int juga = 0; juga < 11; juga++) {
		System.out.println("nombre del jugador numero: "+(juga+1));
		System.out.println(nombre[juga]);
				
		System.out.println("edad del jugador numero: "+(juga+1));
		System.out.println(edad[juga]);
		}
	  }
	}


