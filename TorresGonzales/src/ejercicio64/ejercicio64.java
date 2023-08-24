package ejercicio64;

import java.util.Scanner;

public class ejercicio64 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String apellido;
		String nombre;

		System.out.println("ingrese su nombre: ");
		nombre = entrada.next();

		System.out.println("ingrese su apellido: ");
		apellido = entrada.next();

		String nombreMinuscula = nombre.toLowerCase();
		String apellidoMinuscula = apellido.toLowerCase();
		
		char nombreMayus = nombreMinuscula.toUpperCase().charAt(0);
		
		char apellidoMinus = apellidoMinuscula.toUpperCase().charAt(0);
		
		String recorte = nombreMinuscula.substring(1);
		String recorte2 = apellidoMinuscula.substring(1);
		
		System.out.println(nombreMayus+recorte);
		System.out.println(apellidoMinus+recorte2);
		
	}

}
