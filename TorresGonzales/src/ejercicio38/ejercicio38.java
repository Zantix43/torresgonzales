package ejercicio38;

import java.util.Scanner;

public class ejercicio38 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float num,clientes = -300,clientes2= 300;
		
		for(int clien = 9; clien <=19; clien+=2) {
			System.out.println("ingrese la cantidad de clientes en el horario "+clien);  
		
		num = entrada.nextFloat();
		
		if(num>clientes) {
		clientes = num;
		}
		if(num<clientes2) {
		clientes2 = num;
		}
	 }
	System.out.println("numero maximo de cientes del dia: "+clientes);	
	System.out.println("numero de clientes minimos en el dia: "+clientes2);
	}

}
