package ejercicio48;

import java.util.Scanner;

public class ejercicio48 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String [] nom = new String [4];
		
		for(int i = 0; i < 4; i++) {
			System.out.println("ingrese el apellido numero "+(i+1));  
			nom [i] = entrada.next();
		}
		for (int i = 0; i < nom.length - 1; i++) {
			for (int j = 0; j < nom.length - i - 1; j++) {
				if (nom[j].compareTo(nom[j + 1]) > 0) {
					String temp = nom[j];
					nom[j] = nom[j + 1];
					nom[j + 1] = temp;
	}
			}
}
		System.out.println("apellidos ordenados: ");
		for (String palabra : nom) {
		
			System.out.print(palabra + "  ");}
}
}