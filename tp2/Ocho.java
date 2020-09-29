package tp2;

import java.util.Scanner;
public class Ocho {


    public static void main(String[] args) {
        String cadena, transformada;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena");
        cadena = x.nextLine();
        
        transformada = cadena.replace('a', 'e');
        System.out.println(transformada);
    }
    
    
}
