package arreglosMultidimensionales;

import java.util.Scanner;

public class Dos {

	public static void main(String[] args) {
		
		
		int matriz1[][];
		int matriz2[][];
		int matriz3[][];
		int a;
		int b;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de X");
		a = key.nextInt();
		
		System.out.println("Ingrese el valor de Y");
		b = key.nextInt();
		
		matriz1 = new int [a][b]; 
		matriz2 = new int [b][a];
		matriz3 = new int [a][b];
		
		
		
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[0].length;j++) {
				System.out.println("Ingrese un valor para la posición (" + i + "," + j + ") de la matriz 1");
				matriz1[i][j] = key.nextInt();
			}
		}
		
		System.out.println("******** AHORA PASAREMOS A RELLENAR LA SEGUNDA MATRIZ ********");
		
		for(int i=0;i<matriz2.length;i++) {
			for(int j=0;j<matriz2[0].length;j++) {
				System.out.println("Ingrese un valor para la posición (" + i + "," + j + ") de la matriz 2");
				matriz2[i][j] = key.nextInt();
			}
		}
		
		for(int i=0;i<matriz3.length;i++) {
			for(int j=0;j<matriz3[0].length;j++) {
				matriz3[i][j] = matriz1[i][j] * matriz2[j][i];
			}
		}
		
		System.out.println("MATRIZ 1");
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[0].length;j++) {
				System.out.print(matriz1[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("MATRIZ 2");
		for(int i=0;i<matriz2.length;i++) {
			for(int j=0;j<matriz2[0].length;j++) {
				System.out.print(matriz2[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("MATRIZ 3");
		for(int i=0;i<matriz3.length;i++) {
			for(int j=0;j<matriz3[0].length;j++) {
				System.out.print(matriz3[i][j] + " | ");;
			}
			System.out.println();
		}
	}
}
