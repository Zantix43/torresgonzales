package ejercicio22;

import java.util.Scanner;

public class ejercicio22 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			int bingo;
			char intentos = 0 ;
				System.out.println("ingrese un numero: ");
					bingo = entrada.nextInt();

				double numeroAleatorio = (Math.random()*10);
				int numRedondeado = (int) Math.round(numeroAleatorio);
		
	while(bingo != numRedondeado) {
		System.out.println("No, le erraste.");
		System.out.println("volve a intentarlo: ");
		bingo = entrada.nextInt();
		intentos++;
		}
	System.out.println("ganaste");
	System.out.println("numero de intentos "+intentos);
	}
}
