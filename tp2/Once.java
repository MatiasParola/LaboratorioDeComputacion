package tp2;

import java.util.Scanner;

public class Once {

    public static void main(String[] args) {
        String cadena, cadena1;
        
        Scanner x = new Scanner(System.in);

        System.out.println("Ingrese la primer cadena");
        cadena = x.nextLine();
        
        System.out.println("Ingrese la segunda cadena");
        cadena1 = x.nextLine();
        
        
        if(cadena.equals(cadena1)){//compara dos cadenas
            System.out.println("Las cadenas son iguales");
        }else System.out.println("Las cadenas NO son iguales");
        
        if(cadena.compareTo(cadena1) == 0){ //Compara dos cadenas pero devuelve 0 si las 2 son iguales, en otro caso devuelve positivo o negativo
            System.out.println("Las cadenas son iguales");
        }else System.out.println("Las cadenas NO son iguales");
    
        if(cadena.compareToIgnoreCase(cadena1)==0){ //este caso no toma en cuenta mayusculas ni minusculas, funciona como el compareTo
            System.out.println("Las cadenas son iguales");
        }else System.out.println("Las cadenas NO son iguales");
    
    
    }
    
    
    
}
