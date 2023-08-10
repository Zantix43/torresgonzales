package evaluacion1cuatrimestre;

import java.util.Scanner;

public class evaluacion1cuatrimestre {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String [] apellido = new String [5];
		
		int [] legajo = new int [5];
		
		int [] nota = new int [5];
		
		int suma,division;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("ingrese el numero de legajo de un estudiante: ");
			legajo [i] = entrada.nextInt();
		}
		
		int [] leg = legajo.clone();
		
		for (int i = 0; i < (leg.length - 1); i++) {
			 
			for (int j = 0; j < (leg.length - i - 1) ; j++) {
			
				
				if (leg[j] > leg[j + 1]) {
				
					int temporal = leg[j];
					
					leg[j] = leg[j + 1];
					leg[j + 1] = temporal;
				}
			}	
		  }	
		System.out.println("legajos en orden ascendente :");
		  for (int i = 0; i < leg.length; i++) {
				System.out.print("\nlegajo numero "+(i+1)+" : "+leg[i]);
			}
		
		  for (int i = 0; i < 5; i++) {
				System.out.println("\ningrese el apellido del estudiante :");
				apellido [i] = entrada.next();
			}
		  
		for (int i = 0; i < 5; i++) {
			System.out.println("\ningrese la nota (de 6 a 10) del estudiante :");
			nota [i] = entrada.nextInt();
		}
		
		int [] copia = nota.clone();
		
		for (int i = 0; i < (leg.length - 1); i++) {
		    if (nota [i] == 6 ) {
			System.out.println("la nota mas baja fue : "+ nota[i]+" y le pertenece a : "+apellido[i]);
			}
			if (nota [i] == 10 || nota[i] == 9) {
			System.out.println("la nota mas baja fue : "+nota[i]+" y le pertenece a : "+apellido[i]);
		}
		}
		
	
  suma = copia [0] + copia [1] + copia [2] + copia [3] + copia [4];
		
		for(int i = 0; i< 5; i++) {
			System.out.println("\tnumero de legajo "+legajo[i]+" apellido "+apellido[i]+" nota "+nota[i]);
		}
		
		division = suma / 5;
		
		System.out.println("\tel promedio en total de todos es: "+division);
}
}