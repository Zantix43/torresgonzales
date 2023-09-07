package ejercicio67;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio67 {
	public static void seguridad() throws ArithmeticException, InputMismatchException {
		try {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("ingrese el numero del que quiere sacar la raiz cuadrada");
			int raiz = entrada.nextInt();

			if (raiz < 0) {
                throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
            }
			double resul = Math.sqrt(raiz);

			System.out.println("la raiz cuadrada de " + raiz + " es: " + resul);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division por cero");
		} catch (InputMismatchException e) {
			System.out.println("Error: ingreso de dato incorrecto");
		}
	}

	

	public static void main(String[] args) {

		seguridad();
	}
}

