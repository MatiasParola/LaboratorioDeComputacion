package arreglosMultidimensionales;

import java.util.Scanner;

public class Cuatro {

	public static void main(String[] args) {

		/*
		Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o
		igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú
		con estas opciones:
		a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
		b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
		c) Suma de una columna que se pedirá al usuario (controlar que elija una
		correcta)
		d) Sumar la diagonal principal
		e) Sumar la diagonal inversa
		f) La media de todos los valores de la matriz
		IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se
		deberán de ejecutar, simplemente mostrar un mensaje que diga que debes
		rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de
		las opciones del menú.
		*/
		
		
Scanner key = new Scanner(System.in);
		
		int x;
		int matriz[][];
		int opcion;
		int opcion2;
		boolean relleno = false;
		
		
		System.out.println("Bienvenido al programa X, empecemos!. Primero crearemos una matriz...");
		do {
			System.out.println("Ingrese el tamaño de la matriz cuadrada (entre 4 y 10)");
			x = key.nextInt();
			if(x<4 || x>10) System.out.println("Ingresó un valor fuera de rango");
			
		}while(x<4 || x>10);
		
		matriz = new int[x][x];
		
		
		do {
			System.out.println("\nElige la opción de tu preferencia! \n1. Rellenar la matriz \n2. Sumar una fila de la matriz \n3. Sumar una columna de la matriz"
					+ "\n4. Sumar la diagonal principal \n5. Sumar la diagonal inversa \n6. Saber la media de todos los valores de la matriz \n7. Mostrar la matriz"
					+ "\n8. Salir");
			opcion = key.nextInt();
			if(opcion<1 || opcion>8) System.out.println("No has elegido una opción correcta!");
			else {
				switch(opcion){
				
				//RELLENA MATRIZ
				case 1: 
				relleno = true;
				matriz = ManejoMenu.rellenarMatriz(matriz);
				System.out.println("La matriz ha sido rellenada!");
				System.out.println("A continuación se muestra la matriz");
				ManejoMenu.mostrarMatriz(matriz);
				break;
				
				//SUMA LA FILA ELEGIDA DE LA MATRIZ
				case 2:
					if(relleno==false) {
						System.out.println("Primero tenés que rellenar la matriz! (opción 1)");
						break;
					}
					else {
						do {
							System.out.println("Qué fila querés sumar? (de la 1 a la " + matriz.length + ")");
							opcion2 = key.nextInt();
							if (opcion2<1 || opcion2>matriz.length) System.out.println("No has elegido una fila correcta");
							else {
								System.out.println("La suma de la fila " + opcion2 + " es " + ManejoMenu.sumarFila(matriz, opcion2-1));
							}
						}while(opcion2<1 || opcion2>matriz.length);
					}
					break;
					
				//SUMA LA COLUMNA ELEGIDA DE LA MATRIZ	
				case 3:
					if(relleno==false) {
						System.out.println("Primero tenés que rellenar la matriz! (opción 1)");
						break;
					}
					else {
						do {
							System.out.println("Qué columna querés sumar? (de la 1 a la " + matriz.length + ")");
							opcion2 = key.nextInt();
							if (opcion2<1 || opcion2>matriz.length) System.out.println("No has elegido una columna correcta");
							else {
								System.out.println("La suma de la columna " + opcion2 + " es " + ManejoMenu.sumarColumna(matriz, opcion2-1));
							}
						}while(opcion2<1 || opcion2>matriz.length);
					}
					break;
					
					
				//SUMA LA DIAGONAL
				case 4:
					if(relleno==false) {
						System.out.println("Primero tenés que rellenar la matriz! (opción 1)");
						break;
					}
					else {
						System.out.println("La suma de la diagonal es " + ManejoMenu.sumarDiagonal(matriz));
					}
					break;
				
				//SUMA LA DIAGONAL INVERSA
				case 5:
					if(relleno==false) {
						System.out.println("Primero tenés que rellenar la matriz! (opción 1)");
						break;
					}
					else {
						System.out.println("La suma de la diagonal inversa es " + ManejoMenu.sumarDiagonalInversa(matriz));
					}
					break;
				
				//CALCULA LA MEDIA DE TODOS LOS VALORES DE LA MATRIZ
				case 6:
					if(relleno==false) {
						System.out.println("Primero tenés que rellenar la matriz! (opción 1)");
						break;
					}
					else {
						System.out.println("La media de los valores de la matriz es " + ManejoMenu.mediaValoresMatriz(matriz));
					}
					break;
				case 7:
					ManejoMenu.mostrarMatriz(matriz);
					break;
				
				case 8:
					System.out.println("Gracias por usar el programa!");
					break;
				}
			}
		}while(opcion!=8);
	}
}
