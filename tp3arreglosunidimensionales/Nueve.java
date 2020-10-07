package tp3arreglosunidimensionales;

import java.util.Scanner;

public class Nueve {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
		
		int dni;
		
		System.out.println("Ingrese DNI");
		dni = key.nextInt();
		
		System.out.println("El DNI completo es: " + dni + letras[dni%23]);

	}

}