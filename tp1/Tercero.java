package tp1;

import java.util.Scanner;

public class Tercero {


    public static void main(String[] args) {
        int numero1, numero2;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        numero1 = x.nextInt();
        System.out.println("Segundo numero");
        numero2 = x.nextInt();
        
        System.out.println("Su resultado de la suma es " + (numero1+numero2));
        System.out.println("Su resultado de la resta es " + (numero1-numero2));
        System.out.println("Su resultado de la multiplicacion es " + (numero1*numero2));
        System.out.println("Su resultado de la modulo es " + (numero1%numero2));
        if(numero2 == 0){
            System.out.println("La division por cero no se puede realizar");
        }else System.out.println("Su resultado de la division es " + (numero1/numero2));
            
        //El programa redondea los resultados por una cuestion practida del ejercicio para no agregar complejida
        //En caso de querer resultados decimales solo hay que cambiar el tipo de dato o agregar una 3era variable
    }
    
}
