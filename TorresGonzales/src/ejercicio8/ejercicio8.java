package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double numero,suma,multi;

			System.out.println("ingrese un numero entero con 2 decimales:");
			numero = entrada.nextFloat();
			
			double exponente = 2;
			double potencia = Math.pow(numero, exponente);
			
			int numRedondeado = (int) Math.round(potencia);
			double numeroAleatorio = (Math.random()*1);

				suma = numRedondeado + numeroAleatorio;
				
				multi = suma * 7;
				
				float raiz_cuadrada = (float)Math.sqrt(multi);
				
				System.out.println("este es su resultado: "+raiz_cuadrada);

	}

}
