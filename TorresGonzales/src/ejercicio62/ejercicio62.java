package ejercicio62;

import java.util.Scanner;

public class ejercicio62 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] apellido = new String[5];

		String palabramax = "{";
		String palabramin = "";

		int guardado1 = 0;
		int guardado2 = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("ingrese el apellido " + (i + 1));
			apellido[i] = entrada.next();
		}

		for (int a = 0; a < 5; a++) {

			if (palabramax.compareToIgnoreCase(apellido[a]) > 0) {
				palabramax = apellido[a];
			}

			if (palabramin.compareToIgnoreCase(apellido[a]) < 0) {
				int temporal2 = palabramin.compareToIgnoreCase(apellido[a]);
				palabramin = apellido[a];

			}

		}
		
		System.out.println("la palabra mas cercana a la A es: "+palabramax);

		System.out.println("la palabra mas cercana a la Z es: "+palabramin);
	}
}