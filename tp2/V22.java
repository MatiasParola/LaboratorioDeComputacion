package tp2;

import java.util.Scanner;

public class V22 {

   
    public static void main(String[] args) {
        
        int numero;
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese el numero que desea sumar sus digitos");
        numero = x.nextInt();

        int resultado = sumarDigitos(numero);
        System.out.println(resultado);

     }
    public static int sumarDigitos(int numero){
        if(numero == 0){
            return 0;
        }else {
            return sumarDigitos(numero/10) + numero%10;
        }
    }

}
