package ejercicio56;

import java.util.Scanner;

public class ejercicio56 {

	static int asistencia, clases;

	static int div, multi;

	public static void porcentajeAsistencias() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese la cantidad de asistencias totales: ");
		asistencia = entrada.nextInt();
		System.out.println("ingrese la cantidad de clases totales: ");
		clases = entrada.nextInt();

		div = asistencia * 100;

		multi = div / clases;

	}

	public static void main(String[] args) {

		String nombre, apellido;

		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el nombre del alumno: ");
		nombre = entrada.next();
		System.out.println("ingrese el apellido del alumno: ");
		apellido = entrada.next();

		porcentajeAsistencias();

		System.out.println(
				"el procentaje de asistencias del alumno " + nombre + " " + apellido + " " + "es del :" + multi + "%");

	}
}
