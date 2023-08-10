package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {
public static void main(String[] args) throws InterruptedException {
	Scanner datos = new Scanner(System.in);
	int num_seguidores = 1;
	while (num_seguidores <= 100) {
		System.out.println("Seguidor n°: " +num_seguidores);
		Thread.sleep(200);
		
		if (num_seguidores == 100) {
			System.out.println("Usted ha llegado a los 100 seguidores");
			}
		num_seguidores++;
	}
}

}

