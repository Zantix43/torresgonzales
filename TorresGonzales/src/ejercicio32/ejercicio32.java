package ejercicio32;

import java.util.Scanner;

public class ejercicio32 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		int num,multi;
		int tablalimi = 20;
		
		System.out.println("ingrese el numero del que quiere la tabla: ");
		num = entrada.nextInt();
		
		
		for(int nose = 0; nose <= tablalimi; nose++) {
			multi = nose*num;
			Thread.sleep(200);
			System.out.println(num+"x"+nose+"="+multi);
			
		}
	}

}





