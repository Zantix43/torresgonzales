package ejercicio29;

public class ejercicio29 {
	public static void main(String[] args) throws InterruptedException {
		
		for (int bate = 100; bate >= 1; bate--) {
			System.out.println("la bateria actual es de: "+bate);
			if(bate == 20 ) {
				System.out.println("la bateria ya llego a 20% se recomienda cargar");
				Thread.sleep(1000);	
			}
		}
		
	}

}
