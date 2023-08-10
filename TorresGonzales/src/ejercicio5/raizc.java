package ejercicio5;

import java.util.Scanner;

public class raizc {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float numero;
		
		System.out.println("ingrese el valor:");
		numero = entrada.nextFloat();
		
		float raiz_cuadrada = (float)Math.sqrt(numero);
		
		int numRedondeado = (int) Math.round(raiz_cuadrada);
		
		System.out.println("El valor de la raiz es: "+raiz_cuadrada);
	    System.out.println("El número redondeado es: "+numRedondeado);

	}

}
