package tp3arreglosunidimensionales;

import java.util.Scanner;

public class Diez {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int arreglo1[] = new int[5];
		int arreglo2[] = new int[10];
		int arreglo3[] = new int[5];
		
	
		//Lleno el array1
		for(int i=0; i<5;i++) {
			System.out.println("Por favor ingrese el valor para el array 1 posición " + i);
			arreglo1[i] = key.nextInt();
		}
		
		//Lleno el array2
		for(int i=0; i<10;i++) {
			System.out.println("Por favor ingrese el valor para el array 2 posición " + i);
			arreglo2[i] = key.nextInt();
		}
		
		//Hago los cálculos para llenar el array3
		for (int i=0; i<5; i++) {					
			for(int j=0; j<10; j++) {				
				arreglo3[i]+=arreglo1[i]*arreglo2[j];		
			}
		}
		
		System.out.println();
		
		
		for(int i=0; i<5;i++) {
			System.out.print(arreglo1[i] + "  ");
		}
		
		System.out.println();
		
		
		for(int i=0; i<10;i++) {
			System.out.print(arreglo2[i] + "  ");
		}
		
		System.out.println();
		
		
		for(int i=0; i<5;i++) {
			System.out.print(arreglo3[i] + "  ");
		}
		
		
		
		
		
		
	}

}
