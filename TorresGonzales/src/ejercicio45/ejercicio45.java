package ejercicio45;

import java.util.Scanner;

public class ejercicio45 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);	
		
		int[] num = {1011,2367,8748,9121,817,6423,2034};
		
		String[] nom = {"Enrique","Liliana","Lucas","Juan","Fiorella","Ariel","Daiana"};					
		
		int bus;
		
		System.out.println("Para encontrar a un individuo, ingresar número de socio:");
		bus = entrada.nextInt();
		
		for(int wea = 0; wea<num.length; wea++) {
		
			
			if(bus == num[wea]) {
				System.out.println("se encontro al socio "+nom[wea]+"y su numero de socio es "+num[wea]);
			}
		}
	}

   }
		
	

