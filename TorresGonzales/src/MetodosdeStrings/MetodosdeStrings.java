package MetodosdeStrings;

import java.util.Scanner;

public class MetodosdeStrings {
	public static void main(String[] args) {
		Scanner nose = new Scanner(System.in);
		String caracter;
		
		System.out.println("ingrese una cadena de strings"); 
		caracter = nose.nextLine(); // aqui se pide una cadena de strings para que se pueda analizar

		int numero = caracter.indexOf("digo digo"); // sirve para buscar la subcadena del string ya ingresado y si esta esta devuelve cuantos caracteres tubo que recorrer para llegar a el

		if (numero > 0) { // si encuentra la subcadena muestra cuantos caracteres tubo que recorrer para encontralo
			System.out.println("el numero de caracteres hasta encontrar la palabra malvado es: " + numero);
		}
		if (numero < 0) { // si no encuentra la subcadena devuelve siempre un -1
			System.out.println("la palabra no se encuentra en la cadena");
		}
	}

}
