package ejercicio66;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio66 {
	public static void main(String[] args) {

		boolean cap = false;

		int numero;

		Scanner entrada = new Scanner(System.in);

		while (cap == false) {
			try {
				System.out.println("\ningrese un numero");
				numero = entrada.nextInt();

				if (numero >= 0) {
					cap = true;
					System.out.println("numero aceptado");
				}
			} catch (InputMismatchException ex) {
				System.out.println("\nError: ingreso de dato incorrecto");
				entrada.nextLine();

			}
		}
	}

}
