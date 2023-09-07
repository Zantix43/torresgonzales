package ejercicio68;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio68 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		String apellidos [] = {"Martinez","Torres","Cachi","Miglio","Gonzales"};
		
		
		try {
		System.out.println("ingrese el numero del empleado");
		numero = entrada.nextInt();
		
		System.out.println(apellidos[numero]);
		
		
		} catch (IndexOutOfBoundsException ex){
			System.out.println("el numero es mayor que a los valores del array");
		} catch (InputMismatchException ex) {
			System.out.println("caracter incorrecto");
		}
		
		
		
		
	}

}
