package tercerapartetp;

import java.util.Scanner;

public class tercerapartetp {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		char talla;
		int precio = 5000;
		int precio2 = 5500;
		double multi1,multi2,multi3,resultado1,resultado2,resultado3,descuento1,descuento2,descuento3;			
		
		System.out.println("ingrese una talla: \nS \nM \nL ");
		talla = entrada.next().charAt(0);
		
		switch (talla){
		case 'S':
			int cantidad1;
			System.out.println("cuantas remeras quiere? ");
			cantidad1 = entrada.nextInt();
			
			if (cantidad1 > 30) {
				System.out.println("no hay stock :c");
			}
			else if (cantidad1 >= 15 && cantidad1 < 30) {
				
				multi1 = cantidad1 * precio;
				
				resultado1 = multi1 * 0.15;
				
				descuento1 = multi1 - resultado1;
				
				System.out.println("usted compro: "+cantidad1 +" y obtuvo un descuesto del 15% y el total de la compra es:"+descuento1);
			}
			else {
				multi1 = cantidad1 * precio;
				System.out.println("usted compro "+ cantidad1 +"y el gasto total "+ multi1);
			}
			break;
		case 'M':
			int cantidad2;
			System.out.println("cuantas remeras quiere? ");
			cantidad2 = entrada.nextInt();
			
			if (cantidad2 > 40) {
				System.out.println("no hay stock :c");
			}
			else if (cantidad2 >= 22 && cantidad2 < 40) {
				
				multi2 = cantidad2 * precio2;
				
				resultado2 = multi2 * 0.15;
				
				descuento2 = multi2 - resultado2;
				
				System.out.println("usted compro: "+cantidad2 +" y obtuvo un descuesto del 15% y el total de la compra es: "+descuento2);
			}
			else {
				multi2 = cantidad2 * precio2;
				System.out.println("usted compro "+ cantidad2 +"y el gasto total "+ multi2);
			break;
		}
		case 'L':
			int cantidad3;
			System.out.println("cuantas remeras quiere? ");
			cantidad3 = entrada.nextInt();
			
			if (cantidad3 > 50) {
				System.out.println("no hay stock :c");
			}
			else if (cantidad3 >= 35 && cantidad3 < 50) {
				
				multi3 = cantidad3 * precio2;
				
				resultado3 = multi3 * 0.15;
				
				descuento3 = multi3 - resultado3;
				
				System.out.println("usted compro: "+cantidad3 +" y obtuvo un descuesto del 15% y el total de la compra es: "+descuento3);
			}
			else {
				multi3 = cantidad3 * precio2;
				System.out.println("usted compro "+ cantidad3 +"y el gasto total "+ multi3);
			break;
		}
		default:
			System.out.println("caracter no valido o puesto en minuscula intentelo con ponerlo en mayuscula");
		
	}
	}
}
