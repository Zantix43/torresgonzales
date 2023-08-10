package ejercicio53;

import java.util.Scanner;

public class ejercicio53 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[][] apellido = new String[2][2];

		String bus;
		
		boolean nose = false;

		for (int i = 0; i < apellido.length; i++) {
			for (int j = 0; j < apellido.length; j++) {
				System.out.println("ingrese el "+(i+1)+" apellido");
				apellido[i][j] = entrada.next();
			}
		}

		System.out.println("que apellido desea encontrar? ");
		bus = entrada.next();

		for (int i = 0; i < apellido.length && nose == false; i++) {
			for (int j = 0; j < apellido.length && nose == false; j++) {
				if (apellido[i][j].equalsIgnoreCase(bus)) {
					System.out.println("se encontro el apellido "+" ( "+apellido[i][j]+" ) ");
					nose = true;
				}
			}
		}

		if(nose == false) {
			System.out.println("no se encontro ningun apellido");
		}
	}

}
