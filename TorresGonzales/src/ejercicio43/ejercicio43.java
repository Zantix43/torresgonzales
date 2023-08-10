package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int [] coso = new int[5];

		
		for (int nose = 0; nose < 5; nose++ ) {
			
			System.out.println("ingrese el numero "+(nose+1)+":");
			coso[nose] = entrada.nextInt();
			
		}
	
		for (int nose = 0; nose < 5; nose++) {
			
		if ( coso[nose] < 0) {
		continue;
		}
		else {
			System.out.println(coso[nose]);
		}
	  }
		
	}
}
