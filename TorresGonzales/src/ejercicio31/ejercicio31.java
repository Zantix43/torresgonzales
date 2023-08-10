package ejercicio31;

public class ejercicio31 {
	public static void main(String[] args) throws InterruptedException {
		
		for(int tequiero = 0; tequiero <= 100; tequiero++) {
			Thread.sleep(20);
			System.out.println(tequiero+") te quiero");
		}
		System.out.println("<3");
	}

}
