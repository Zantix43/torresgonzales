package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		char talla;
		System.out.println("elija una de estas tallas: \nS. \nM. \nL. ");
		talla = datos.next().charAt(0);
		
		switch(talla){
		case 'S':
			System.out.println("quedan 5 remeras de esta talla");
		break;
		case 'M':
			System.out.println("quedan 2 remeras de esta talla");
		break;
		case 'L':
			System.out.println("ya no quedan remera de esta talla");
		break;
		default:
			System.out.println("esta no es una talla en el caso de que hallas puesto la letra prueba con ponerla en mayuscula");
		}
		
	}

}
