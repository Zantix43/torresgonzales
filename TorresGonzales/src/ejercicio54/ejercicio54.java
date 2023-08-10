package ejercicio54;

import java.util.Scanner;

public class ejercicio54 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char[][] tatetibv = new char[3][3];

		int columna1;
		int fila1;

		int columna2;
		int fila2;

		boolean nose = false;

		System.out.println("\nturnense no joda ");

		for (int i = 0; i < tatetibv.length && nose == false; i++) {
			for (int j = 0; j < tatetibv.length && nose == false; j++) {

				System.out.println("\ningrese el numero de la fila(recuerden poner cfilas y columnas diferentes)");
				fila1 = entrada.nextInt();
				System.out.println("\ningrese el numero de la columna");
				columna1 = entrada.nextInt();

				System.out.println("\nelija entre X u O (recorda cual sos vos");
				tatetibv[fila1][columna1] = entrada.next().charAt(0);

				if (tatetibv[0][0] == 'X' && tatetibv[0][1] == 'X' && tatetibv[0][2] == 'X') {
					System.out.println("gano la X en horizontal");
					nose = true;
				}

				if (tatetibv[2][0] == 'X' && tatetibv[2][1] == 'X' && tatetibv[2][2] == 'X') {
					System.out.println("gano la X en horizontal");
					nose = true;
				}

				if (tatetibv[1][0] == 'X' && tatetibv[1][1] == 'X' && tatetibv[1][2] == 'X') {
					System.out.println("gano la X en horizontal");
					nose = true;
				}

				if (tatetibv[0][1] == 'X' && tatetibv[1][1] == 'X' && tatetibv[2][1] == 'X') {
					System.out.println("gano la X en vertical");
					nose = true;
				}

				if (tatetibv[0][0] == 'X' && tatetibv[1][0] == 'X' && tatetibv[2][0] == 'X') {
					System.out.println("gano la X en vertical");
					nose = true;
				}

				if (tatetibv[0][2] == 'X' && tatetibv[1][2] == 'X' && tatetibv[2][2] == 'X') {
					System.out.println("gano la X en vertical");
					nose = true;
				}

				if (tatetibv[0][0] == 'X' && tatetibv[1][1] == 'X' && tatetibv[2][2] == 'X') {
					System.out.println("gano la X en diagonal");
					nose = true;
				}

				if (tatetibv[0][2] == 'X' && tatetibv[1][1] == 'X' && tatetibv[2][0] == 'X') {
					System.out.println("gano la X en diagonal");
					nose = true;
				}

				if (tatetibv[0][0] == 'O' && tatetibv[0][1] == 'O' && tatetibv[0][2] == 'O') {
					System.out.println("gano la O en horizontal");
					nose = true;
				}

				if (tatetibv[2][0] == 'O' && tatetibv[2][1] == 'O' && tatetibv[2][2] == 'O') {
					System.out.println("gano la O en horizontal");
					nose = true;
				}

				if (tatetibv[1][0] == 'O' && tatetibv[1][1] == 'O' && tatetibv[1][2] == 'O') {
					System.out.println("gano la O en horizontal");
					nose = true;
				}

				if (tatetibv[0][1] == 'O' && tatetibv[1][1] == 'O' && tatetibv[2][1] == 'O') {
					System.out.println("gano la O en vertical");
					nose = true;
				}

				if (tatetibv[0][0] == 'O' && tatetibv[1][0] == 'O' && tatetibv[2][0] == 'O') {
					System.out.println("gano la O en vertical");
					nose = true;
				}

				if (tatetibv[0][2] == 'O' && tatetibv[1][2] == 'O' && tatetibv[2][2] == 'O') {
					System.out.println("gano la O en vertical");
					nose = true;
				}

				if (tatetibv[0][0] == 'O' && tatetibv[1][1] == 'O' && tatetibv[2][2] == 'O') {
					System.out.println("gano la O en diagonal");
					nose = true;
				}

				if (tatetibv[0][2] == 'O' && tatetibv[1][1] == 'O' && tatetibv[2][0] == 'O') {
					System.out.println("gano la O en diagonal");
					nose = true;
				}
			}

		}

		if (nose == false) {
			System.out.println("el juego quedo en empate");
		}

		System.out.println("\nel tateti: ");
		for (int i = 0; i < tatetibv.length; i++) {
			for (int j = 0; j < tatetibv[i].length; j++) {

				System.out.print(tatetibv[i][j] + " ");
			}
			System.out.println();
		}

	}
}
