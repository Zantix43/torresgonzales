package ejercicio59;

import java.util.Scanner;

public class ejercicio59 {


	static int[] n1 = new int[3];

	static int max = -300, min = 300;

	public static void nose() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("ingrese el numero " + (i + 1) + ":");
			n1[i] = entrada.nextInt();
			
		}
	}

	public static void algo() {
		for (int a = 0; a < n1.length; a++) {
			if (n1[a] > max) {
				max = n1[a];
			}
			if (n1[a] < min) {
				min = n1[a];
			}
		}
	}

	public static void main(String[] args) {
		nose();
		algo();
		
		System.out.println("el numero mayor es : "+max);
		System.out.println("el numero minimo es: "+min);
	}
}
