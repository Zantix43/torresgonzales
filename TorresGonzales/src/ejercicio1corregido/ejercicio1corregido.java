package ejercicio1corregido;

import java.util.Scanner; /* es una libreria que nos permite poner el scaner */

public class ejercicio1corregido { /* es el nombre de la clase */
	public static void main(String[] args) { /* funcion principal */
		Scanner datos = new Scanner(System.in); /* esto despues nos ayudara a poner datos  */
		
		int opc; /* int es una variable que representa numeros enteros */
		
		System.out.println("\tEste programa te permite resolver algunos problemas"); /* syso sirve para mostrar lo que escribamos en la linea */
		System.out.println("\t Eliga una opcion: ");
		System.out.println("1. Calcular raiz cuadrada.");
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println("3. Jugar al bingo.");

		opc = datos.nextInt(); /* sirve para ingresar datos */

		switch (opc) { /* variable que dependiendo el caso muestra un caso u otro */

		case 1: /* en case se puede poner el numero o la letra que hace que se pueda llegar a linea o otra */
			System.out.println("Ingresa un numero para calcular su raiz cuadrada: ");

			int num_raiz;
			num_raiz = datos.nextInt();

			if (num_raiz >= 0) { /* if es un si osea que si se cumple lo la condicion que pide hace lo que esta hay */
				int raiz_cuadrada = (int) Math.sqrt(num_raiz);
				System.out.println("El resultado es: " + raiz_cuadrada);
			}
			 else { /* si no se cumple la condicion sale lo que esta en else */
				System.out.println("No se puede calcular la raiz de un negativo.");
			}
			break; /* sirve para que los case no se mezclen determinando donde terminan estos */
			
		case 2:
			int num_s;
			System.out.println("Ingresa un numero: ");
			num_s = datos.nextInt();
		

			if (num_s == 0) {
				System.out.println("El numero es cero");
			} 
			else if (num_s > 0) { /* es un si/no si o se cumple lo del if pero se cumple lo que esta aqui muestra lo del if else */
				System.out.println("El numero es positivo");
			} 
			else {
				System.out.println("El numero es negativo");
			}
			break;

		case 3:
			int num_bingo;
			System.out.println("Ingresa un numero entre 0 y 9");

			num_bingo = datos.nextInt();

			double num_ganador_d = (Math.random()* 9); /* sirve para generar un numero aleatorio y tu eliges el limite */
			int num_ganado =  (int) Math.round(num_ganador_d); /* sirve para que los numeros en double pasen a ser entero,en el caso anterior puede devolver numeros flotantes por eso es mejor combertirlos en enteros */
			
			if (num_bingo == num_ganado) {
				System.out.println("Ganaste! ");
			} 
			else if (num_bingo > 9) {
				System.out.println("numero incorrecto");
			}
			else {
				System.out.println("Perdiste :( ");
				System.out.println("El numero ganador era: " + num_ganado);
			}
			break;
			

		default: /* si no se cumple ningun case sale en pantalla lo que esta puesto en esta opcion */
			System.out.println("Opcion incorrecta.");
			break;

		}
		
	}
}


