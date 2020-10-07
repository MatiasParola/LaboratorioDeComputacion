package tp3arreglosunidimensionales;

import java.util.Scanner;
import java.lang.Math;

public class Seis {

   
    public static void main(String[] args) {
        mensajeInicial();
        entrada();

     }
    
    public static void mensajeInicial(){
        System.out.println("Algoritmo que llena un array y busca el numero que se le indique, devuelve un mensaje del resultado de la busqueda");
    }
    
    public static void entrada(){
          int [] array = new int[50];
       
        Scanner key = new Scanner(System.in);
      
        for(int i=0; i<50; i++){
            //rellena el arreglo de valores del 1 al 100
            array[i] =  (int) (Math.floor(Math.random()*(1-100+1)+100));
            System.out.println(array[i]);//Muestro el array para fines practicos
            
        }
        
        System.out.println("Ingrese el numero que quiere encontrar en el arreglo");
        int numero = key.nextInt();
        
        validar(array,numero);
        
        
        
        
    }
    
    public static void validar(int array[], int numero){
        int contador = -1;
        for(int i = 0; i<50; i++){
            if(array[i] == numero ){
            contador = i;
            break;
            }   
        }
        
            if(contador>=0){
            System.out.println("El numero " + numero + " se encontro en la posicion " + (contador+1) + " del arreglo");
            }else System.out.println("Su numero no se encuentra en este arreglo");
         
    }
    
}
