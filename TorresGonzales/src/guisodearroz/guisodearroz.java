package guisodearroz;

import java.util.Scanner;

public class guisodearroz {
	
public static void main (String args[]) {

Scanner entrada = new Scanner (System.in);

String nombre1;
String nombre2;

int edad1;
int edad2;

System.out.println("ingrese el nombre1");
nombre1 = entrada.next();

System.out.println("ingrese la edad1");
edad1 = entrada.nextInt();

System.out.println("ingrese el nombre2");
nombre2 = entrada.next();

System.out.println("ingrese la edad2");
edad2 = entrada.nextInt();

	System.out.println("el nombre1 y la edad1 son: "+nombre1+"y "+edad1);
	System.out.println("el nombre2 yla edad2 son: "+nombre2+"y "+edad2);

}


}