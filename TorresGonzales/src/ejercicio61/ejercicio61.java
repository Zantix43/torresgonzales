package ejercicio61;

import java.util.Scanner;

public class ejercicio61 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombre;
		String apellido;

		System.out.println("ingrese su nombre: ");
		nombre = entrada.next();

		System.out.println("ingrse su apellido: ");
		apellido = entrada.next();

		
		String min = nombre.toLowerCase();
		
		String mayus = apellido.toUpperCase();
		
		
		System.out.println("nombre: "+min+" longitud: "+min.length());
		System.out.println("apellido: "+mayus+" longitud "+mayus.length());
	}
}
