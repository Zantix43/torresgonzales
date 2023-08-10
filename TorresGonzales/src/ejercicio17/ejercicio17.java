package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		int	num2;
		int	num3;
		
		System.out.println("ingrese el numero 1: ");
		num1 = entrada.nextInt();

		System.out.println("ingrese el numero 2: ");
		num2 = entrada.nextInt();

		System.out.println("ingrese el numero 3: ");
		num3 = entrada.nextInt();
	
		if (num1>num2 && num1>num3 && num2>num3) {
			System.out.println("Primero: "+ num1+"\tSegundo"+num2+"\tTercero:"+num3 );
		}
		else if (num1>num2 && num1>num3 && num3>num2) {
			System.out.println("Primero: "+ num1+"\tSegundo"+num3+"\tTercero:"+num2 );
		}
		else if (num2>num1 && num2>num3 && num1>num3) {
			System.out.println("Primero: "+ num2+"\tSegundo"+num1+"\tTercero:"+num3 );
		}
		else if (num2>num1 && num2>num3 && num3>num1) {
			System.out.println("Primero: "+ num2+"\tSegundo"+num3+"\tTercero:"+num1 );
		}
		else if (num3>num1 && num3>num2 && num1>num2) {
			System.out.println("Primero: "+ num3+"\tSegundo"+num1+"\tTercero:"+num2 );
		}
		else if (num3>num1 && num3>num2 && num2>num1) {
			System.out.println("Primero: "+ num3+"\tSegundo"+num2+"\tTercero:"+num1 );
		}
		
	}

}
