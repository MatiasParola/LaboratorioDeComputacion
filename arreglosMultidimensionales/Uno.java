package arreglosMultidimensionales;

import java.util.Scanner;

public class Uno {

   
    public static void main(String[] args) {
        mensaje();
        entrada();
    

     }
    
    public static void mensaje(){
        System.out.println("Bienvenido al programa uno del tp de arreglos multidimensionales");
    }
    
    public static void entrada(){
        String [][] arreglo = new String[4][4];
        
      
        Scanner key = new Scanner(System.in);
        System.out.println("Ingrese un pais y luego 3 de sus ciudades");
        for(int i = 0; i<arreglo.length;i++){
        
                
            for(int j = 0;j<arreglo[0].length;j++){
        
                arreglo[i][j] = key.nextLine();
            }
            
        }
        mostrarMatriz(arreglo);
    }
    
    public static void mostrarMatriz(String arreglo[][]){
        for(int i = 0;i<arreglo.length;i++){
            System.out.println("");
            System.out.print("Pais: ");
            for(int j = 0;j<arreglo[0].length;j++){
                System.out.print(arreglo[i][j] + " ");
                if(j==0){
                    System.out.print(" Ciudad: ");
                }
            }
        }
    }

}
