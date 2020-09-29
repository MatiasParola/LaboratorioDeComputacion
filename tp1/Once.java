package tp1;

import java.util.Scanner;

public class Once {

    
    public static void main(String[] args) {
    
        final String contrasena = "imposible";
        String cadena;
        int intentos;
        Scanner x = new Scanner(System.in);
        
        intentos = 0;
        do{
            System.out.println("Ingrese la contraseña");
            cadena = x.nextLine();
            if(cadena.equals(contrasena)){
                intentos = 5;
            }else intentos++;
        }while(intentos < 3);
        
        if(intentos<4){
            System.out.println("Lamentamos decirle que se quedo sin intentos, suerte la proxima vez");
            
        }else System.out.println("Acceso correcto");
    }
    
}
