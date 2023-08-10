package ejercicio57;

import java.util.Scanner;

public class ejercicio57 {

	static float numero,resul;
	static int laparte; 
	
	public static float fraccion(float a) {
		laparte = (int) a;
		
		resul =  a - laparte;
		return resul;
	}
	
	
	
	
	public static void main(String[] args) {

		

		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese un numero float ");
		numero = entrada.nextFloat();

		
		fraccion(numero);
		
		System.out.println("la parte fraccionaria es: "+resul);
	}

}
