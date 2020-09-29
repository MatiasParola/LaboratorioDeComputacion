package tp1;

import java.util.Scanner;

public class Diez {

    public static void main(String[] args) {
    
        int numero;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero mayor a cero");
            numero = x.nextInt();
        }while (numero < 0);
        System.out.println("Su numero es "+numero);
    }
    
}
