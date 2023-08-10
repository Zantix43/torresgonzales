package ejercicio60;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio60 {
	/* int [] leg = legajo.clone(); */

	static String[] apellido;

	static int[] notas;

	static int limite;

	public static int[] calificacion(int n) {
		notas = new int[n];
		for (int i = 0; i < n; i++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingrese la " + (i + 1) + " nota: ");
			notas[i] = entrada.nextInt();
			if (notas[i] <= 0) {
				System.out.println("la nota es menor que 0, vuelva a intertarlo: ");
				notas[i] = entrada.nextInt();
			}
			
			if (notas[i] >= 10) {
				System.out.println("la nota es mayor que 10, vuelva a intertarlo: ");
				notas[i] = entrada.nextInt();
			}
		}
		return notas;
	}

	public static String[] apellidos(int n) {
		Scanner entrada = new Scanner(System.in);
		apellido = new String[n];
		for (int e = 0; e < n; e++) {
			System.out.println("ingrese el apellido del alumno: ");
			apellido[e] = entrada.next();
		}
		return apellido;
	}

	public static void lim() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese la cantidad de notas y alumnos: ");
		limite = entrada.nextInt();
	}

	public static void main(String[] args) {
		lim();
		
		String [] guardar1 = apellidos(limite);
		
		int [] guardar2 = calificacion(limite);
		
		for(int u = 0; u < limite; u++) {
			System.out.println("el alumno "+guardar1[u]+" tiene la nota: "+guardar2[u]);
		}
	}
}
