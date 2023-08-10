package santi;

import java.util.Scanner;

public class santi1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantos DNI desea almacenar?");
		int cantidad = entrada.nextInt();
		
		int[] DNI = new int[cantidad];
		
		for(int i = 0; i < DNI.length; i++) {
			System.out.println("Ingrese el DNI numero " +(i + 1) +":" );
			DNI[i] = entrada.nextInt();
		
		}
	
		for(int i = 0; i < (DNI.length - 1); i++) {
			for(int j = 0; j < (DNI.length - i - 1); j++) {
				if (DNI[j] > DNI[j + 1]) {
					int temporal = DNI[j];
					DNI[j] = DNI[j + 1];
					DNI[j + 1] = temporal;
							
				}
			}
		}
		for(int i = 0; i < DNI.length; i++) {
			System.out.println("\nEl DNI numero " +(i + 1) +" es:" +DNI[i]);	
		}
		
		String[] apellido = new String[cantidad];
		
		for(int i = 0; i < DNI.length; i++) {
			System.out.println("\nIngrese el apellido del DNI número " +(i + 1) +":" );
			apellido[i] = entrada.next();
		}
		
		System.out.println("\nIngrese el DNI a encontrar:");
		int DNI_buscar = entrada.nextInt();
		
		boolean busqueda = false;
	
		for(int i = 0; i < DNI.length; i++) {
			if (DNI_buscar == DNI[i]) {
				System.out.println("\nEl DNI " +DNI[i] +" fue encontrado y pertenece a " +apellido[i]);
				busqueda = true;
				break;
			
			}
		}
	
			if(busqueda = false) {
				System.out.println("No se encontro el DNI ingresado.");
			}
	
	}
	
}
