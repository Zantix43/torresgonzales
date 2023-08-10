package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

	int nota;
	
		System.out.println("ingrese su nota");
		nota = entrada.nextInt();
		
		if (nota <= 10 ) {
			System.out.println("sobresaliente");	
		}
		
		else if (nota >= 1 && nota <= 3) {
			System.out.println("insuficiente");	
		}
		else if (nota < 6) {
			System.out.println("no logrado");
		}
		else if (nota >= 6 && nota <= 7) {
			System.out.println("suficiente");
		}
		else if (nota >= 8 && nota <= 9) {
			System.out.println("notable");
		}
		else {
			System.out.println("valor incorrecto");
		}

	}

}
