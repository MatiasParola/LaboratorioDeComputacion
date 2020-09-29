package tp1;

import java.util.Scanner;

public class Doce {

    
    public static void main(String[] args) {
        int dia;
        Scanner x = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese un numero para el dia de la semana");
            System.out.println("Siendo 1 para lunes, 2 para martes y asi sucesivamente hasta 7 domingo");
            dia = x.nextInt();
        }while((dia<1) || (dia>7));
        
        switch(dia){
            case 1 :  System.out.println("El Lunes es un dia laboral");break;
            case 2 : System.out.println("El Martes es un dia laboral");break;
            case 3 : System.out.println("El Miercoles es un dia laboral");break;
            case 4 : System.out.println("El Jueves es un dia laboral");break;
            case 5 : System.out.println("El Viernes es un dia laboral");break;
            case 6 : System.out.println("El Sabado es un dia no laboral");break;
            case 7 : System.out.println("El Domingo es un dia no laboral");break;
            
            
        }
           
    
    }
    
}
//Se puede hacer con manejo de excepciones por las dudas que el usuario no ingrese un numero
