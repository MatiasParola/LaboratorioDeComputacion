package arreglosMultidimensionales;


import java.util.Scanner;

public class ManejoMenu {
	
	public static int[][] rellenarMatriz(int matriz[][]){
		Scanner leer = new Scanner(System.in);
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz[0].length;j++) {
				System.out.println("Ingresa el valor de la posición [" + (i+1) + "," + (j+1) + "]");
				matriz[i][j] = leer.nextInt();
			}
		}
		
		return matriz;
	}
	
	public static void mostrarMatriz(int matriz[][]){
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz[0].length;j++) {
				if(j==matriz[0].length-1) System.out.println(matriz[i][j]);
				else System.out.print(matriz[i][j] + "  |  ");
				 
			}
			
		}
	}
	
	public static int sumarFila(int matriz[][], int fila) {
		int suma = 0;
		
		for (int j=0;j<matriz.length;j++) {
			suma+=matriz[fila][j];
		}
		
		return suma;
	}
	
	public static int sumarColumna(int matriz[][], int columna) {
		int suma = 0;
		
		for (int i=0;i<matriz.length;i++) {
			suma+=matriz[i][columna];
		}
		
		return suma;
	}
	
	
	public static int sumarDiagonal(int matriz[][]) {
		int suma = 0;
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[0].length;j++) {
				if(i==j) suma+=matriz[i][j];
			}
			
		}
		
		return suma;
	}
	
	public static int sumarDiagonalInversa(int matriz[][]) {
		int suma = 0;
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[0].length;j++) {
				if((i+j)==(matriz.length-1)) suma+=matriz[i][j];
			}
			
		}
		
		return suma;
	}
	
	public static double mediaValoresMatriz(int matriz[][]) {
		int suma = 0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<matriz[0].length;j++) {
				suma+=matriz[i][j];
			}
		}
		
		return ((double)Math.round((suma/(matriz.length*matriz.length)) * 100d) / 100d);
		
		
	}

}