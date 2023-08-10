package santi;

public class santi2 {
	public static void main(String[] args) {
		
		String[] apellido = {"Ramon", "Kamek", "Pastorizo"};
		int[] edad = {25, 21, 45};
		int[] DNI = {65312124, 47803822, 45678902};
		
		String[] marca = {"Chevrolet", "Peugeot", "Renault"};
		String[] modelo = {"Corsa", "208", "Sandero"};
		int[] anio = {2018, 2021, 2022};
		String[] patente = {"AD178JK", "AD200RS", "AD202VW"};
		
		for(int i = 0; i < 3; i++) {
			if(anio[i] > 2020 && edad[i] > 25) {
				System.out.println("El auto " +marca[i] +" " +modelo[i] +" del año " +anio[i] +", pertenece a " +apellido[i] +" que tiene " +edad[i] +" años, y su DNI es " +DNI[i]);
			}
		}
		
	}
}
