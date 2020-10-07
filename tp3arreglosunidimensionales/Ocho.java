package tp3arreglosunidimensionales;

import java.util.Scanner;

public class Ocho {

	public static void main(String[] args) {
		
		
		
		Scanner key = new Scanner(System.in);
		
		String frase;
		String arreglo[];
		double cadena[];
		double total;
		double promedio;
		
		total = 0;
		
		System.out.println("Ingrese una secuencia de números separados por guion medio");
		frase = key.nextLine();
		
		arreglo=frase.split("-");
		
		cadena = new double[arreglo.length];
		
		for(int i=0;i<arreglo.length;i++) {
			cadena[i] = Double.parseDouble(arreglo[i]);
			total += cadena[i];
		}
		
		for(int i=0;i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
		
		System.out.println("La suma total de los números ingresados es: " + (double)Math.round(total*100)/100);
		System.out.println("El promedio de los números ingresados es: " + ((double)Math.round(total/cadena.length*100)/100));

	}

}
