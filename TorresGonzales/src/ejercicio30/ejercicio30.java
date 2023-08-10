package ejercicio30;

public class ejercicio30 {
	public static void main(String[] args) throws InterruptedException {
		
		for (int segui = 0; segui <= 100; segui++) {
			Thread.sleep(200);
			System.out.println("numero de seguidores actuales: "+segui);
		}
		Thread.sleep(1000);
		System.out.println("llego a los 100  seguidores");
		Thread.sleep(1000);
		System.out.println("el streamer dijo algo malo sobre la milanesa");
		
		for (int menos = 100; menos >= 1; menos--) {
			Thread.sleep(200);
			System.out.println("numero de seguidores actuales: "+menos);
		}
		System.out.println("pelotudo");
	}
}
