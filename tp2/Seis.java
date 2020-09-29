package tp2;

import java.util.Scanner;

public class Seis {

    public static void main(String[] args) {
        String transformada;
        String cadena = "La lluvia en Mendoza es escasa";
        int ascii,flag,nda;
        int contador = 0;
        
        Scanner x = new Scanner(System.in);
       
        System.out.println(cadena.length());
        System.out.println("El largo de la cadena es "+ cadena.length());
        
        cadena = cadena.toUpperCase();
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i) == ('A') || cadena.charAt(i) == ('E') || cadena.charAt(i) == ('I') || cadena.charAt(i) == ('O') || cadena.charAt(i) == ('U')){
                contador++;
            }
        }
        System.out.println("El numero de vocales es "+contador);
        
        
        transformada = cadena.replace('A', 'E');
        System.out.println(transformada);
        
         for(int i=0;i<cadena.length();i++){
             ascii = cadena.charAt(i);
             System.out.print(cadena.charAt(i) + " = "+ascii);
             System.out.print(" ");
         }
         System.out.println("");
         do{
             System.out.println("Ingrese 0 para transformar la cadena a mayuscula o 1 para minuscula");
             flag = x.nextInt();
             nda=0;
             if(flag == 1 || flag == 0){
                 nda = 3;
             }
         }while(nda==0);
         if(flag==1){
             cadena = cadena.toLowerCase();
         }else cadena = cadena.toUpperCase();
             System.out.println(cadena);
         
        }
        
    }
    
    

