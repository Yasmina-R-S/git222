package git222;

public class buscar_numero {

	public static void main(String[] args) {
		

		        // Solicitar el número a buscar
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Introduce un número para buscar: ");
		        int numero = scanner.nextInt();

		        // Buscar el número en la matriz
		        int encontrado = 0; // Contador para registrar cuántas veces aparece el número
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                if (matriz[i][j] == numero) {
		                    System.out.println("El número " + numero + " se encuentra en la fila " + (i + 1) + ", columna " + (j + 1));
		                    encontrado++;
		                }
		            }
		        }

		        // Si no se encuentra el número
		        if (encontrado == 0) {
		            System.out.println("El número " + numero + " no se encuentra en la matriz.");
		        }
	 }

}
