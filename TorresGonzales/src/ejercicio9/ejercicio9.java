package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;

		System.out.println("ingrese su nombre: ");
		nombre = entrada. nextLine();
		
		double numeroAleatorio = (Math.random()*99);
		
		int numRedondeado = (int) Math.round(numeroAleatorio);
		
		System.out.println("hola "+nombre+" el numero de bingo es: "+numRedondeado);

		int num_bingo = entrada.nextInt();

		double num_ganador_d = (Math.random()* 9);
		int num_ganado =  (int) Math.round(num_ganador_d);
		
		if (num_bingo == num_ganado) {
			System.out.println("Ganaste! ");
	}

}
}