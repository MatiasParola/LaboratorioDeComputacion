package tp3arreglosunidimensionales;

import java.util.Scanner;

public class Tres {

   
    public static void main(String[] args) {
        
        int [] multiplos;
        int numero, acumulador, indice;
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del arreglo");
        indice = key.nextInt();
        multiplos = new int[indice];
        System.out.println("Elija el numero del cual quiere saber sus multiplos");
        numero = key.nextInt();
        
        acumulador = 1;
        for(int i = 0; i<multiplos.length; i++){
            multiplos[i] = numero * acumulador;
            acumulador++;
        }
        
        System.out.println("Los multiplos de " + numero + " son: ");
        for(int i = 0; i<multiplos.length;i++){
            System.out.print(multiplos[i] + (","));
        }
        

     }

}
