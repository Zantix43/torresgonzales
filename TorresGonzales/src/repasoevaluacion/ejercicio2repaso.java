package repasoevaluacion;

public class ejercicio2repaso {

	// TE FALT� LA FUNCI�N PRINCIPAL.
	// gracias sebas :D
	public static void main(String[] args) {

		String[] apellido = { "Perez", "Gutierres", "Santos" };

		int[] edad = { 31, 23, 27 };

		int[] dni = { 50697857, 26827052, 38796215 };

		String[] marca = { "Chevrolet", "Peugeot", "Renault" };

		String[] modelo = { "Corsa", "208", "Sandero" };

		int[] sal = { 2018, 2021, 2022 };

		String[] patente = { "AD178JK", "AD200RS", "AD202VW" };

		for (int i = 0; i < edad.length; i++) {
			
			if(edad[i] >= 25 && sal[i] >= 2020) {
			System.out.println("\nEl auto "+marca[i]+" modelo "+modelo[i]+" del a�o "+sal[i]+", patente "+patente[i]+", pertenece a "+apellido[i]+" , que tiene "+edad[i]+" a�os, y su DNI es "+dni[i]);
			}
	   }
	}
}