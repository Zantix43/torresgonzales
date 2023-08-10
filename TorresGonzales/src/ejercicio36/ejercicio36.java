package ejercicio36;

import java.util.Scanner;

public class ejercicio36 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float dato,maxi = -3000,min = 3000;
		float horario=0,wea=0;

		for (int hora = 8; hora <= 17; hora++) {
			System.out.println("ingrese la cantidad ganada a la hora: "+hora);
			dato = entrada.nextFloat();
			
			if (dato>maxi) {
				maxi=dato;
				horario=hora;
			}
			if (dato<min) {
				min=dato;
				wea=hora;
			}
		}
		System.out.println("la hora del ingreso maximo fue "+horario+" y lo ganado es: "+maxi);
	    System.out.println("la hora del ingreso minimo fue "+wea+" y lo ganado es: "+min);
	}
}
