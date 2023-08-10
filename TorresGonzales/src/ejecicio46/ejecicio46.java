package ejecicio46;

import java.util.Scanner;

public class ejecicio46 {
	public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);	


int[] num = {1011,2367,8748,9121,817,6423,2034};

String[] nom = {"Enrique","Liliana","Lucas","Juan","Fiorella","Ariel","Daiana"};					

int bus;


for(int wea = 0; wea<num.length; wea++) {

	bus = num [wea] % 2;
	
	if(bus >= 1) {
		System.out.println(nom[wea]+" tiene un numero impar de socio ya que dio como resultado: "+bus);
                 }
	else {
		continue;
	     }
                                        }
	}
}