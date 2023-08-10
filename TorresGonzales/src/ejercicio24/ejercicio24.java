package ejercicio24;

import java.util.Scanner;


public class ejercicio24 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char sino;
		boolean decision = false;

		
		System.out.println("puedo salir?(S/N)");
		sino = entrada.next().charAt(0);

		while (sino == 'N' && decision == false ) {
		System.out.println("puedo salir?(SI/NO)");
		sino = entrada.next().charAt(0);
		
		if (sino == 'S') {
			decision = true;
		}
		}
		
	}

}
