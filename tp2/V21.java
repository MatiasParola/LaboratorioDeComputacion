package tp2;

import java.util.Scanner;

public class V21 {

   
    public static void main(String[] args) {
        
        int numero;
        
        Scanner x = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un numero mayor que 0");
            numero = x.nextInt();
            
        }while(numero<1);
    
        int resultado = sumatoria(numero);
        System.out.println("La sumatoria de todos los numeros es " + resultado);

     }
    
    public static int sumatoria(int numero){
        if(numero == 1){
            return 1;
        }else{
            return numero + sumatoria(numero-1);
        }
    }

}
