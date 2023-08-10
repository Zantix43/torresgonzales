package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int lawearara;
	
		System.out.println("ingrese un numero negativo o positivo: \n");
		lawearara = entrada.nextInt();
		
		if (lawearara < 0) {
			System.out.println("el numero es negativo");
		}
		
		else if (lawearara == 0) {
			System.out.println("te pedi un numero negativo o positivo no un 0 pelotud");
		}
		
		else {
			System.out.println("el numero es positivo");
		}
		
	}

}
