package tp1;

import java.util.Scanner;

public class Catorce {

    public static void main(String[] args) {
        
        int numero, intentos;
        Scanner x = new Scanner(System.in);
        
        int o = new Double(Math.random()*100).intValue();
        
        intentos = 0;
        do{
            System.out.println("Ingrese un numero entre 0 y 100");
            System.out.print("Numero ingresado = ");
            numero = x.nextInt();
            
            if(numero < o){
                System.out.println("Es muy bajo");
            }else System.out.println("Es muy alto");
            intentos++;
        }while(numero != o);
           
        System.out.println("Correcto, numero encontrado, cantidad de intentos "+intentos);

    }
    
}
