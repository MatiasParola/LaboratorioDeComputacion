package arreglosMultidimensionales;

import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		ManejoGolosinas manejo = new ManejoGolosinas();
		int opcion;
		int eleccionFila;
		String contrasenia = "AdminXYZ";
		String ingresoPass;
		int cantidad;
		
		String golosinas [] = {"01 ---> Kitkat            ", "02 ---> Chicles            ", "03 ---> Caramelos de menta ", "04 ---> Huevo Kinder      ", 
				"05 ---> Chetoos           ", "06 ---> Twix              ", "07 ---> M&M'S             ", "08 ---> Papas Lays        ", 
				"09 ---> Milkybar          ", "10 ---> Aljajor Tofi      ", "11 ---> Lata Coca         ", "12 ---> Chitos            "};
		int matriz [][] = {{32, 10}, {2,50}, {2,50}, {25,10}, {30,10}, {26,10}, {35,10}, {40,20}, {30,10}, {20,15}, {50,20}, {45,10}};
		
                System.out.print("Bienvenido! ");
		
		do {
			System.out.println("Selecciona una opción \n1. Comprar golosina \n2. Mostrar golosinas \n3. Rellenar golosinas (sólo técnico)"
					+ "\n4. Apagar máquina");
			opcion = leer.nextInt();
			if(opcion<1 || opcion>4) System.out.println("No has elegido una opción correcta!");
			else {
				switch(opcion){
				case 1: 
					System.out.println("Selecciona la fila de la golosina");
					eleccionFila = leer.nextInt();
					
					matriz = manejo.pedirGolosina(matriz, eleccionFila);
					break;
				case 2:
					manejo.mostrarMatriz(golosinas, matriz);
					break;
				case 3:
					leer.nextLine();
					System.out.println("Por favor ingresa la contraseña");
					ingresoPass = leer.nextLine();
					if(ingresoPass.equals(contrasenia)){
						System.out.println("Ingresa la fila de la golosina a rellenar");
						eleccionFila = leer.nextInt();
						System.out.println("Ingresa la cantidad");
						cantidad = leer.nextInt();
						manejo.rellenaGolosinas(matriz, eleccionFila, cantidad);
					}
					else {
						System.out.println("La contraseña ingresada no es correcta!");
					}
					break;
				case 4:
					System.out.println("La cantidad total de ventas del día fue de $ " + manejo.getTotal());
					System.out.println("Apagando máquina...");
					break;
				}	
			}
		}while(opcion!=4);
	}
}
