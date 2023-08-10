package ejercicio47;

import java.util.Scanner;

public class ejercicio47 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] nota = new int [4];
		String apellido;
		
		int nosexd;
		
		System.out.println("ingrese su a apellido: ");
		apellido = entrada.next();
		
		for(int a = 0; a < 4; a++) {
			System.out.println("ingrese sus notas: ");
			nota [a] = entrada.nextInt();
			}
		System.out.println("notas desordenadas: ");
		for (int noset : nota) {
			System.out.print(noset + " ");
		}
		for (int i = 0; i < (nota.length - 1); i++) {
			 
			for (int j = 0; j < (nota.length - i - 1) ; j++) {
			
				
				if (nota[j] > nota[j + 1]) {
				
					int temporal = nota[j];
					
					nota[j] = nota[j + 1];
					nota[j + 1] = temporal;
				}
			}
		}
		System.out.println("notas ordenadas: ");
		
		for (int noset : nota) {
			System.out.print(noset + " ");
		}

	}

}
