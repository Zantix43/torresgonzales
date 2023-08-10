package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char talla;
		
		System.out.println("ingrese que talla desea (S,M,L): ");
		talla = entrada.next().charAt(0);
		
		if (talla == 'S') {
			System.out.println("quedan 5 remeras de esta talla");
		}
		else if (talla == 'M') {
			System.out.println("quedan 2 remeras de esta talla");
		}
		else if (talla == 'L') {
			System.out.println("ya no quedan remeras de esta talla");
		}
		else {
			System.out.println("caracter incorrecto");
		}
			
	}

}
