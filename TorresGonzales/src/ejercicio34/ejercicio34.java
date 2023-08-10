package ejercicio34;

import java.util.Scanner;

public class ejercicio34 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float preciopos,precio = -100000,precio2 = 100000;

		for ( int nose = 0; nose <= 12; nose ++) {
		 System.out.println("ingrese la cantidad del mes "+nose+" :");
		 preciopos = entrada.nextFloat();
		 
		 if(preciopos>precio) {
			precio = preciopos;
		 }
		 if (preciopos<precio2) {
			 precio2 = preciopos;
		 }
       }
		System.out.println("el numero minimo de ingreso es: "+precio2);  
		System.out.println("el numero maximo de ingreso es: "+precio);
	}								
}


