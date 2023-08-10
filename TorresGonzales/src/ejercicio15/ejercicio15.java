package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cuenta;
		double resultado;
		double resta;
		
		
		System.out.println("ingrese la valor total de su compra: ");
		cuenta = entrada.nextInt();
		
		if (cuenta > 15000) {
			
			resultado = cuenta * 0.10;
			
			resta = cuenta - resultado;
			
			System.out.println("obtuvo un descuento descuento del 10%,el total es: " + resta);
			
		}
		else {
			int numRedondeado = (int) Math.round(cuenta);
			
			System.out.println("no obtuvo un descuento el total es: " + numRedondeado);
		}
	}

}
