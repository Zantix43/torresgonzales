package ejercicio42;

import java.util.Scanner;

public class ejercicio42 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int y;
		int [] nose = new int[5];
		
		double numeroAleatorio = (Math.random()*5);
		int numRedondeado = (int) Math.round(numeroAleatorio);

		
		for(y = 0; y<3; y++) {
			System.out.println("ingrese numero el "+(y+1)+"n");
			nose[y] = entrada.nextInt();

		}
		if(nose[y] >= numRedondeado) {
			System.out.println("GANASTE");
			System.out.println("el numero era "+numRedondeado);
		}
		else {
			System.out.println("PERDISTE");
			System.out.println("el numero era "+numRedondeado);
		}
	}

}
