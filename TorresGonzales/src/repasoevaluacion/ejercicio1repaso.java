package repasoevaluacion;

import java.util.Scanner;

public class ejercicio1repaso {
	
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
 
	int cantidad;
	
	int encontrar;
	
	boolean flag = false;

	System.out.println("ingrese la cantidad de dni que desea ingresar :");      
	cantidad = entrada.nextInt();

	int [] dni = new int [cantidad];
	
	String [] apellido = new String [cantidad];

	for (int i = 0; i < cantidad; i++) {
		System.out.println("ingrese el dni numero "+(i+1));
		dni [i] = entrada.nextInt();
	}
	
	for ( int a = 0; a < cantidad; a++){
		System.out.println("ingrese el apellido relacionado al  "+(a+1)+" dni");
		apellido [a] = entrada.next();
	}
	
	for (int i = 0; i < (dni.length - 1); i++) {
		 
		for (int j = 0; j < (dni.length - i - 1) ; j++) {
		
			
			if (dni[j] > dni[j + 1]) {
			
				int temporal = dni[j];
				
				dni[j] = dni[j + 1];
				dni[j + 1] = temporal;
			}
		}	
	  }	
	for (int noset : dni) {
		System.out.print("\n "+noset + " ");
	}
	
	System.out.println("\npara encontrar a alguien ponga el numero de  dni del individuo: ");
	encontrar = entrada.nextInt();
	
	for (int e = 0; e < dni.length; e++) {
		
		if ( encontrar == dni[e]) {
			flag = true;
			System.out.println("\nse encontro a "+apellido[e]+" y su numero de dni es "+dni[e]);
		}
	}
	
	if (flag == false) {
		System.out.println("no se puedo encontrar el dni");
	}
	}

 }

