
public class main {

	public static void main(String[] args) {
		
		int[][] matriz = {{2, 5, 6},
						  {8, 9, 13},
						  {31, 41, 61}};
		System.out.println(verificadorDeAscendencia(matriz));
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












