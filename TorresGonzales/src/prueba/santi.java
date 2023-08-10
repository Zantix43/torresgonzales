package prueba;

import java.util.Scanner;

public class santi {
	public static void main(String[] args) {
		Scanner lectura = new Scanner(System.in);

		float promedio = 0, div;
		int milanesa, milamax = -300, milamin = 300;
		int hora;

		for (hora = 8; hora <= 14; hora += 2) {
			System.out.println("¿Cuantos sanguches de milanesa se producen a las " + hora + " hs:");
			milanesa = lectura.nextInt();

			if (milanesa > milamax) {
				milamax = milanesa;
			}

			if (milanesa < milamin) {
				milamin = milanesa;
			}

			if (milanesa <= 20) {
				System.out.println("La cantidad " + milanesa + " es menor o igual a 20");
			}
			promedio += milanesa;
		}

		System.out.println("El promedio es: " + promedio / 4);
		System.out.println("El numero de sanguches minimo es: " + milamin);
		System.out.println("El numero de sanguches maximo es: " + milamax);

	}

}
