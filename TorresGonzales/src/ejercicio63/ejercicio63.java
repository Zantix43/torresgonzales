package ejercicio63;

import java.util.Scanner;

public class ejercicio63 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String contraseņa;
		String correo;
		boolean nose = true;
		
		System.out.println("ingrese su correo: ");
		correo = entrada.nextLine();
		
		int numero = correo.indexOf("@");
		int numero2 = correo.indexOf(".");
	
		while (numero == -1 || numero2 == -1 || numero >  numero2) {
			
			System.out.println("correo incorrecto vuelva a intentarlo: ");
			correo = entrada.nextLine();
			
			numero= correo.indexOf("@");
			numero2 = correo.indexOf(".");
			
			if (numero == -1 || numero2 == -1 || numero > numero2) {
				continue;
			}
			
		}
		
		System.out.println("correo aceptado");
		
		
		System.out.println("\ningrese la contraseņa");
		contraseņa = entrada.next();
		
		int guardado = contraseņa.length();
		
		while (guardado < 6 || guardado >= 16) {
			System.out.println("contraseņa incorrecta vuelva a intertarlo: ");
			contraseņa = entrada.next();
			
			guardado = contraseņa.length();
			
			if(guardado < 6 || guardado >= 16) {
				continue;
			}
			
		}
		
		System.out.println("contraseņa y correo aceptados");
		
		
	}

}
