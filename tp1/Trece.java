package tp1;

import java.util.Scanner;

public class Trece {

    public static void main(String[] args) {
        int numero;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero = x.nextInt();
        
        primo(numero);

    }
    static void primo(int numero){
        int contador = 0;
        for(int i = 1; i<numero;i++){
            if(numero%i == 0){
                contador++;
            }
            if(contador>1){
                System.out.println(numero + " no es primo");
                break;
            }
        }
        if(contador<2){
            System.out.println(numero + " es primo");
        }
    }
    
}
