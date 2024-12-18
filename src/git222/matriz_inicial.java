package git222;

public class matriz_inicial {

	public static void main(String[] args) {
		  int FILAS = 5; 
	        int COLUMNAS = 5; 
	        int[][] matriz = new int[FILAS][COLUMNAS]; 

	        // Rellenar la matriz con números aleatorios
	        for (int i = 0; i < FILAS; i++) { 
	            for (int j = 0; j < COLUMNAS; j++) { 
	                matriz[i][j] = (int) (Math.random() * 100) + 1; 
	            } 
	        } 

	        // Mostrar la matriz en la consola
	        for (int i = 0; i < FILAS; i++) { 
	            for (int j = 0; j < COLUMNAS; j++) { 
	                System.out.print(matriz[i][j] + "\t"); 
	            } 
	            System.out.println(); 
	        } 
	   } 
}