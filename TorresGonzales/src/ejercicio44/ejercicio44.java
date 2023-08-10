package ejercicio44;

import java.util.Scanner;

public class ejercicio44 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		float [] ala = new float [4];
		float [] num = new float [4];
		
		for (int wenas = 0; wenas < 4; wenas++) {
			System.out.println("ingrese el "+(wenas+1)+" DNI: ");
			ala [wenas] = entrada.nextFloat();
		}
		
		for (int wenas = 0; wenas < 4; wenas++) {
			
		num [wenas] = ala [wenas] % 2;
			
		if (num [wenas] >= 1) {
			
			System.out.println("el DNI :"+ala [wenas]+" es par ya que dio "+num [wenas]+" en la division ");;
		}
		else {
			continue;
		}
	  }
	}
}
