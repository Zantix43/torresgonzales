package ejercicio33;

import java.util.Scanner;

public class ejercicio33 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		String nombre;
		int edad;
		
	System.out.println("ingrese nombre del jugador");
	nombre = entrada.next();
	
	System.out.println("ingrese su edad");
	edad = entrada.nextInt();
	
	for(int i = 0; i <= 3 ; i++) {
		System.out.println("ingrese nombre del jugador");
		nombre = entrada.next();
		
		System.out.println("ingrese su edad");
		edad = entrada.nextInt();
	}
	System.out.println("nombre: "+nombre);
	System.out.println("edad: "+edad);
	/* solo mostrara lo ultimo que se ingreso para llegar a mostrar todo se tendria que usar vectoress*/
		
	}
	

}
