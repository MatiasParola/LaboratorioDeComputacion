package tp3arreglosunidimensionales;

import java.lang.Math;
import java.util.Scanner;

public class Cinco {

   
    public static void main(String[] args) {
        mensajeInicial();
        entrada();

     }
    
    public static void mensajeInicial(){
        System.out.println("Algoritmo para llenar un array y devoler el promedio de esos numeros");
    }
    
    public static void entrada(){
          int [] array = new int[20];
       
        Scanner key = new Scanner(System.in);
      
        for(int i=0; i<20; i++){
            array[i] =  (int) (Math.floor(Math.random()*(1-50+1)+50))*2;
            System.out.println(array[i]);
        }
        
        int promedio = sumar(array);
        
        //calculo(array,promedio);
        
        int mayor = mayor(array,promedio);
        int menor = menor(array,promedio);
        int igual = igual(array,promedio);
        
        
        salida(mayor, menor,igual, promedio);
        
    }
    
    public static int mayor(int array[], int promedio){
        int mayor = 0;
        for(int i = 0; i<20;i++){
            if(array[i]> promedio){
                mayor++;
            }
        }
        return mayor;
    }
    
    public static int menor(int array[], int promedio){
        int menor = 0;
        for(int i = 0; i<20; i++ ){
            if(array[i]<promedio){
                menor ++;
            }
        }
        
        return menor;
    }
    
    public static int igual(int array[], int promedio){
        int igual = 0;
        for(int i = 0; i<20;i++){
            if(array[i]== promedio){
                igual++;
            }
        }
        return igual;
    }
    
    public static int sumar(int array[]){
        int total = 0;
        int promedio;
        for(int i = 0; i<20; i++){
            total += array[i];
        }
        promedio = total/20;
        return promedio;
    }
    
    public static void salida(int mayor, int menor, int igual, int promedio){
        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("El numero de notas mayor al promedio es: " + mayor);
        System.out.println("El numero de notas menor al promedio es: " + menor);
        System.out.println("El numero de notas igual al promedio es: " + igual);
        
    }
    
    /*Otra alternativa para realizar los opertaciones sin la necesidad de tantos metodos
    public static void calculo(int array[], int promedio){
         int igual = 0;
        for(int i = 0; i<20;i++){
            if(array[i]== promedio){
                igual++;
            }
        }
                int menor = 0;
        for(int i = 0; i<20; i++ ){
            if(array[i]<promedio){
                menor ++;
            }
        }
        
        int mayor = 0;
        for(int i = 0; i<20;i++){
            if(array[i]> promedio){
                mayor++;
            }
        }
        salida(mayor, menor, igual, promedio);
    }
    */
}