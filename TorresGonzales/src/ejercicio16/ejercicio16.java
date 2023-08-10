package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

	int hora;
	
	int minutos;
	
	int segundos;
	
	System.out.println("ingrese la cantidad de horas: ");
	hora = entrada.nextInt();
	
	System.out.println("ingrese la cantidad de minutos: ");
	minutos = entrada.nextInt();
	
	System.out.println("ingrese la cantidad de segundos: ");
	segundos = entrada.nextInt();
	
	if (hora <= 24 && minutos <= 60 && segundos <= 60) {
		System.out.println("el horaio ingresado es correcto");
	}
	else {
		System.out.println("el horario es incorrecto");
	}
		
	}
	
	}


