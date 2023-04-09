import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de Filas:");
		int numeroDeFilas = scan.nextInt();
		
		System.out.println("Ingrese el numero de Columnas:");
		int numeroDeColumnas = scan.nextInt();
		
		int [][] matriz = new int[numeroDeFilas][numeroDeColumnas];
		
		System.out.println("Ingrese los datos de la matriz:");
		for(int i = 0; i < numeroDeFilas; i++) {
			for(int j = 0; j < numeroDeColumnas; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Resultado: " + verificadorDeAscendencia(matriz));
	}

	public static boolean verificadorDeAscendencia(int [][] matrizParametro) {
		int numeroDeFilas = matrizParametro.length;
		int numeroDeColumnas = matrizParametro[0].length;
		int r = 0;
		for(int i = 0; i < numeroDeFilas; i++) {
			for(int j = 0; j < numeroDeColumnas; j++) {
				if(j == numeroDeColumnas - 1) {
					if(i != numeroDeFilas - 1) {
						r = matrizParametro[i + 1][0] - matrizParametro[i][j];
					}
					if(r < 0) {
						return false;
					}
				}else {
					r = matrizParametro[i][j + 1] - matrizParametro[i][j];

					if(r < 0) {
						return false;
					}
				}
			} 
		}
		
		return true;
	}
	
}












