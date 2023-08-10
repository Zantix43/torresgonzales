package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float nota,promedio1 = -200,promedio2 = 5;
		float total;

		for(int waos = 1; waos <= 5; waos++) {
			System.out.println("ingrese la "+waos+" nota del alumno");
		nota = entrada.nextFloat();
		
		if (nota>promedio1) {
			promedio1 = nota;
		}
		if (nota<promedio2) {
			promedio2 = nota;
		}
	  }
		System.out.println("la nota maxima fue: "+promedio1);
		System.out.println("la nota minima fue: "+promedio2);
		
		total = promedio1/promedio2;
		
		int numRedondeado = (int) Math.round(total);
		 
		System.out.println("la nota final es: "+numRedondeado);
		
	}	
}
