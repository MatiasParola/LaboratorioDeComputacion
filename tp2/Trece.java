package tp2;

import java.util.Scanner;

public class Trece {


    public static void main(String[] args) {
        String cadena, cadena1;
        
        Scanner x = new Scanner(System.in);

        System.out.println("Ingrese la primer cadena");
        cadena = x.nextLine();
        
        System.out.println("Ingrese la segunda cadena");
        cadena1 = x.nextLine();
        
        if(cadena.indexOf(cadena1)!=-1){ //En el caso que la cadena o caracter no exita el metodo devuelve -1
            System.out.println("La segunda cadena se encuentra contenida en la primera");
        }
        if(cadena.contains(cadena1)){
            System.out.println("La segunda cadena se encuentra contenida en la primera");
        }
    }
    
}
