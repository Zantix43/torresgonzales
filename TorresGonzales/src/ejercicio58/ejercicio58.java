package ejercicio58;

import java.util.Scanner;

public class ejercicio58 {

	static int num;

	static boolean si = false;

	public static void ingresar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero :");
		num = entrada.nextInt();
	}

	public static void nose() {

		if (num >= 0) {
			System.out.println("el numero es positivo");
			si = true;
		}
		if (num < 0) {
			System.out.println("el numero es negativo");
		}

	}

	public static void bandera() {

		if (si == true) {
			System.out.println("la bandera es true :)");
		}

		if (si == false) {
			System.out.println("la bandera es false >:(");
		}
	}

	public static void main(String[] args) {

		ingresar();
		nose();
		bandera();
	}

}
