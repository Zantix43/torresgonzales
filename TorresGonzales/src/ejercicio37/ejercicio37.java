package ejercicio37;

public class ejercicio37 {
	public static void main(String[] args) throws InterruptedException {

		for(char letra = 'A'; letra <= 'Z'; letra++) {
			Thread.sleep(200);
			System.out.println("letra "+letra);
			if(letra == 'A') {
				System.out.println("vocal "+letra);
			}
			if(letra == 'E') {
				System.out.println("vocal "+letra);
			}
			if(letra == 'I') {
				System.out.println("vocal "+letra);
			}
			if(letra == 'O') {
				System.out.println("vocal "+letra);
			}
			if(letra == 'U') {
				System.out.println("vocal "+letra);
			}
		}	
	}
}
