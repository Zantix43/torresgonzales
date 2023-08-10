package ejercicio6;

import java.util.Scanner;

public class ejercicioalu {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float numero;
		
		System.out.println("ingrese la nota que saco en el examen: ");
		numero = entrada.nextFloat();
	
		int numRedondeado = (int) Math.round(numero);
		System.out.println("su calificacion total es:"+numRedondeado);
	}

}
