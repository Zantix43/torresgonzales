package ejercicio25;

import java.util.Scanner;

public class ejercicio25 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char sino;
		boolean decision = false;
		int intentos = 1;
		
		do{
			intentos++;
			System.out.println("puedo salir?(S/N)");
			sino = entrada.next().charAt(0);
			if (sino == 'S') {
				decision = true;
			
			}
		}while (sino == 'N' && decision == false ) ;
		
		if (intentos == 5) {
		System.out.println("perdiste llegaste a los 5 intentos");
		decision = true;
		}
		if (sino == 'S' && decision == true) {
			System.out.println("GRACIAS!!");
		}
		}
	
	}



