package tp1;

import java.util.Scanner;

public class Quinto {

    public static void main(String[] args) {
        
        int numero1;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese un numero por pantalla");
        numero1 = x.nextInt();
        if(numero1 == 0){
            System.out.println("Usted ingreso 0");
        } else if(numero1%2 == 0){
            System.out.println("El numero es divisible por 2");
        }else System.out.println("El numero no es divisible por dos");
                    
        
          
    }
}
