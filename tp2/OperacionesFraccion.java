package tp2;

import java.util.Scanner;

public class OperacionesFraccion {

   
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        
        System.out.println("Ingrese el numerador de la primera fraccion");
        int num1 = x.nextInt();
        System.out.println("Ingrese el denominador de la primera fraccion");
        int den1 = x.nextInt();
        
        Fraccion f1 = new Fraccion(num1,den1);
        
        System.out.println("Ingrese el numerador de la segunda fraccion");
        int num2 = x.nextInt();
        System.out.println("Ingrese el denominador de la segunda fraccion");
        int den2 = x.nextInt();
        
        Fraccion f2 = new Fraccion(num2,den2);
        
        Fraccion suma = Fraccion.sumarFraccion(f1, f2);
        Fraccion resta = Fraccion.restarFraccion(f1, f2);
        Fraccion multiplicacion = Fraccion.multiplicarFraccion(f1, f2);
        Fraccion division = Fraccion.dividirFraccion(f1, f2);
        
        System.out.println(suma.toString());
        System.out.println(resta.toString());
        System.out.println(multiplicacion.toString());
        System.out.println(division.toString());
        
     }

}
