package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int contra = 2006;
		
		int intentos = 0;
		
		int insert;
		
		System.out.println("ingrese la contrase�a");
		insert = entrada.nextInt();
		
		
		while (insert != contra ) {
			intentos++;
			System.out.println("contrase�a incorrecta ");
			System.out.println("\nnumero de intentos actuales"+intentos);
			System.out.println("\nvuelva a ingresar la contrase�a");
			insert = entrada.nextInt();

		if (intentos == 3) {
			System.out.println("numero de intentos alcanzado usuario bloqueado");
			break;
		}
		
		}	
		if (insert == contra) {
			System.out.println("contrase�a correcta");
		}
	}
}
