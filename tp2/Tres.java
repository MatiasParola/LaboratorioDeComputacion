package tp2;

import java.util.Scanner;
        
public class Tres {

    
    public static void main(String[] args) {
        
        
        int numero,contenedor,resto;
        boolean flag = true;
        Scanner x = new Scanner(System.in);
        
        contenedor =0 ;
        
        do{
            System.out.println("Ingrese un numero de 3 digitos entre el 100 y el 999");
            numero = x.nextInt();
            if(numero<1000 & numero>99){
                flag = false;
            }
            
        }while(flag);
        
        for(int i=0;i<3;i++){
            resto = numero % 10;
            numero = numero / 10;
            contenedor = contenedor + resto;
        }
                
        System.out.println(contenedor);
        
    }
    
}
