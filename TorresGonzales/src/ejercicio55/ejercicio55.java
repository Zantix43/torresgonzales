package ejercicio55;

import java.util.Scanner;

public class ejercicio55 {

	static float divicion;

	public static void numero() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el numero:");
		divicion = entrada.nextFloat();
	}

	public static double alCuadrado(float a) {
		float result = a * a;

		return result;
	}

	public static void main(String[] args) {

		numero();
		alCuadrado(divicion);
		System.out.println("el resultado de la potenciacion es : " + alCuadrado(divicion));

	}
}
