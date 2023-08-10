package ejercicio52;

import java.util.Scanner;

public class ejercicio52 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[][] nose = new int[2][2];

		nose[0][0] = 6;
		nose[0][1] = -2;

		nose[1][0] = 8;
		nose[1][1] = 5;

		for (int i = 0; i < nose.length; i++) {
			for (int j = 0; j < nose[i].length; j++) {
				if (nose[i][j] < 0) {
					System.out.println("el numero " + nose[i][j] + " de la tabla es negativo porfavor ingrese otro:");
					nose[i][j] = entrada.nextInt();

				}
			}
		}

		System.out.println("\nmatriz arreglada: ");
		for (int i = 0; i < nose.length; i++) {
			for (int j = 0; j < nose[i].length; j++) {

				System.out.print(nose[i][j] + " ");
			}
			System.out.println();
		}

	}
}
