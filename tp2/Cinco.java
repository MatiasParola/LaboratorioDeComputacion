package tp2;

import java.util.Scanner;
public class Cinco {


    public static void main(String[] args) {
        int numero;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese un valor");
        numero = x.nextInt();
        
        String algo = String.valueOf(numero);
        System.out.println("Su dato es \""+algo+"\"");
    
    }
    
    
}
