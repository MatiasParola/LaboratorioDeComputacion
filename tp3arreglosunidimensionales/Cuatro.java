package tp3arreglosunidimensionales;

import java.util.Scanner;

public class Cuatro {

   
    public static void main(String[] args) {
        mensajeInicial();
        entrada();

     }
    
    public static void mensajeInicial(){
        System.out.println("Algoritmo para llenar un array y devoler el menor y mayor de los valores junto con su valor absoluto");
    }
    
    public static void entrada(){
          int [] array = new int[20];
       
        Scanner key = new Scanner(System.in);
      
        for(int i=0; i<20; i++){
            System.out.println("Ingrese el numero " + (i+1));
            array[i] = key.nextInt();
        }
        int mayor = mayor(array);
        int menor = menor(array);
        int valor = valorAbsoluto(mayor,menor);
        
        salida(mayor, menor, valor);
        
    }
    
    public static int mayor(int array[]){
        int mayor = array[0];
        for(int i = 0; i<20;i++){
            if(array[i]>= mayor){
                mayor = array[i];
            }
        }
        return mayor;
    }
    
    public static int menor(int array[]){
        int menor = array[0];
        for(int i = 0; i<20; i++ ){
            if(array[i]<=menor){
                menor = array[i];
            }
        }
        
        return menor;
    }
    
    public static int valorAbsoluto(int mayor, int menor){
        int valAbsoluto = mayor - menor;
        return valAbsoluto;
    }
    
    public static void salida(int mayor, int menor, int valor){
        System.out.println("El numero mayor de su arreglo es: " + mayor);
        System.out.println("El numero menor de su arreglo es: " + menor);
        System.out.println("El valor absoluto entre " + mayor + " y " + menor + " es: " + valor);
    }
}
