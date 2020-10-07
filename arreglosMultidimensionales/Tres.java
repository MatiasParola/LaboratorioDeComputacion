package arreglosMultidimensionales;

import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int x;
		int matriz[][];
		int arreglo[];
		int total;
                
                total = 0;
		
		do {
		System.out.println("Ingrese el tamaño de la matriz cuadrada entre 3 y 10");
		x = key.nextInt();
		if(x<3 || x>10) System.out.println("Ingresó un valor fuera de rango");
		}while(x<3 || x>10);
		
		matriz = new int[x][x];
		arreglo = new int[x];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.println("Ingrese el valor de la posición [" + i + "," + j + "] de la matriz");
				matriz[i][j] = key.nextInt();
			}
		}
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				arreglo[i] += matriz[j][i];
			}
			total+=arreglo[i];
		}
		
		System.out.println("******************************************");
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<matriz.length;i++) {
			System.out.print(arreglo[i] + " | ");
		}
		
		
		System.out.println();
		System.out.println("Total: " + total);
	}
}