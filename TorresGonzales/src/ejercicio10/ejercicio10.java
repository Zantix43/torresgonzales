package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("\tIngrese un numero: ");
		numero = entrada.nextInt();
		
		double numeroAleatorio = (Math.random()*99);
		
		int numRedondeado = (int) Math.round(numeroAleatorio);
		
		if ( numero == numRedondeado ) {
			System.out.println("ganaste");
		}
		else {
			System.out.println("perdiste");
		}
				
	}
}