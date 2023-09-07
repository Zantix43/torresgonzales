package ejercicio65;

import java.util.InputMismatchException;



import java.util.Scanner;

public class ejercicio65 {

	public static void main(String[] args)  {
		
		Scanner entrada = new Scanner (System.in);
		
	try {
		System.out.println("ingrese su edad");
		int edad = entrada.nextInt();
		
		if (edad < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
	} 		
	catch (ArithmeticException ex) {
		System.out.println("Error: numero negativo");
	} catch (InputMismatchException ex) {
		System.out.println("Error: ingreso de dato incorrecto");
	}
		
		
	
		
	}
}
