package tp2;

import java.util.Scanner;

public class V23 {

   
    public static void main(String[] args) {
        
        String cadena;
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese su cadena");
        cadena = x.nextLine();
        
        String resultado = invertir(cadena);
        System.out.println(resultado);
    

     }
    static String invertir(String cadena){
        if(cadena.length()== 1){
            return cadena;
        }else{
            return invertir(cadena.substring(1)) + cadena.charAt(0);
        }
    }

}
