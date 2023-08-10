package ejercicio21;

public class ejercicio21 {
	public static void main(String[] args) throws InterruptedException {

		int temp = 2;
		while (temp <=100) {
			
			System.out.println("Jugador temperatura: "+temp);
			Thread.sleep(200);
			
			temp++;
			temp++;
			if (temp == 36 ){
				 System.out.println("LA TEMPERATURA YA LLEGO A 35°C");
			 }
			
			if (temp == 86 ) {
				Thread.sleep(1000);

				System.out.println("LA TEMPERATURA YA LLEGO 85°C CUIDADO TEMPERATURA PELIGROSA SE RECOMIENDA APAGAR");	
			}
		}	
		System.out.println("VALOR EXTREMO APAGANDO PC");
	}

}
