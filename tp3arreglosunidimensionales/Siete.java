package tp3arreglosunidimensionales;

import java.util.Scanner;

public class Siete {

   
    public static void main(String[] args) {
        
        mensajeSaludo();
        entrada();
    

     }
    
    public static void mensajeSaludo(){
        System.out.println("Bienvenido, este programa solicita 10 numeros despues los guarda en arreglos de deiferente manera ");
    }
    
    public static void entrada(){
        
        
        int [] arreglo = new int[10];
        
        Scanner key = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            System.out.println("Ingrese el numero " + (i+1) + " del arreglo");
            arreglo[i] = key.nextInt();
        }
        ascendente(arreglo);
        descendente(arreglo);
    }
    
    public static void ascendente(int arreglo[]){
        int [] ascendente = new int[10];
        for(int i=0;i<arreglo.length; i++){
            ascendente[i]=arreglo[i];
        }
        mostrarArreglo(ascendente);
    }
    
    public static void descendente(int arreglo[]){
        int [] descendente = new int[10];
        int e = 0;
        for(int i=arreglo.length-1;i>=0; i--){
            
            descendente[e]=arreglo[i];
            e++;
        }
        mostrarArreglo(descendente);
    }
    
    public static void mostrarArreglo(int arreglo[]){
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("el numero " + arreglo[i] + " Se encuentra en la posicion " + (i+1));
        }
    }

}
