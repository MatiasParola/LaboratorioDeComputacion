package tp1;

import java.util.Scanner;

public class Cuarto {

    public static void main(String[] args) {

        int numero1, numero2 ;
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero1 = x.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = x.nextInt();
        
        if(numero1<numero2){
            System.out.println("El numero mayor es "+numero2);
        }else if(numero1 == numero2){
            System.out.println("Los dos numero son iguales");
        }else System.out.println("El numero mayor es "+numero1);
        

    }
    
}
