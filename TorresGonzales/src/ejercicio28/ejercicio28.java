package ejercicio28;

public class ejercicio28 {
	public static void main(String[] args) throws InterruptedException {
		
		int bate = 100;
		
		while ( bate >= 1) {
			
			bate--; 
			
			System.out.println("la bateria actual es: "+bate+"%");
			Thread.sleep(200);
			
			if (bate == 20 ) {
				System.out.println("la bateria ya llego a 20% se recomienda cargar");
				Thread.sleep(1000);
		}
		System.out.println();
		
		}
		System.out.println("bateria agotada");
			
	}	
}
