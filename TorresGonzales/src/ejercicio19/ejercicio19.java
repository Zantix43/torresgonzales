package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int cafe;

		System.out.println("elija una opcion de cafe: \n1. \n2. \n3. \n4. \n5 para salir.");
		cafe = datos.nextInt();
		
		switch(cafe) {
		case 1:
			System.out.println("usted eligio cafe cortado");
		break;
		case 2:
			System.out.println("usted eligio cafe latte");
		break;
		case 3:
		System.out.println("usted elegio cafe solo");
		break;
		case 4:
			System.out.println("usted elegio cafe lagrima");
		break;
		case 5:
			System.out.println("tenga buen dia");
		break;
		default:
			System.out.println("opcion incorrecta solo puede elegir estas 4 opciones");
		}

	}

}
