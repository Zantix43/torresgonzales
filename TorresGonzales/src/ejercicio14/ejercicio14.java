package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor;
		
		System.out.println("ingrese un numero: ");
		valor = entrada.nextInt();

		
		if (valor > 0) {
			System.out.println("es distinto de 0 se puede dividir");
		}
		else {
			System.out.println("no es distinto de 0 no se puede dividir");
		}

	}

}
