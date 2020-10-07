package tp3arreglosunidimensionales;

import java.util.Scanner;

public class Dos {

   
    public static void main(String[] args) {
        
        int [] numeros = new int[5];
        Scanner key = new Scanner(System.in);
        
        //Ingreso de datos
        for(int i = 0; i<5; i++){
            System.out.println("Ingrese el numero: " + (i+1));
            numeros[i] = key.nextInt();
    }
        //Mostrar datos
        System.out.println("   -------------   ");
        for(int i = 0; i<5; i++){
            System.out.println(numeros[i]);
        }

    

     }

}
