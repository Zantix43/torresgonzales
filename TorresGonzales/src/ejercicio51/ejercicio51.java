package ejercicio51;

public class ejercicio51 {

	public static void main(String[] args) {
        float[][] matriz = new float[3][3];
   
        
        matriz[0][0] = 3.456f;
        matriz[0][1] = 2.123f;
        matriz[0][2] = 5.454f;
        
        matriz[1][0] = 4.872f;
        matriz[1][1] = 1.373f;
        matriz[1][2] = 6.736f;
        
        matriz[2][0] = 8.345f;
        matriz[2][1] = 9.738f;
        matriz[2][2] = 89.372f;
       
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            	
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
	
}

