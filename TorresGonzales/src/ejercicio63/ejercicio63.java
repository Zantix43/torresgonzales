package ejercicio63;

import java.util.Scanner;

public class ejercicio63 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String contraseña;
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
		
		
		System.out.println("\ningrese la contraseña");
		contraseña = entrada.next();
		
		int guardado = contraseña.length();
		
		while (guardado < 6 || guardado >= 16) {
			System.out.println("contraseña incorrecta vuelva a intertarlo: ");
			contraseña = entrada.next();
			
			guardado = contraseña.length();
			
			if(guardado < 6 || guardado >= 16) {
				continue;
			}
			
		}
		
		System.out.println("contraseña y correo aceptados");
		
		
	}

}
