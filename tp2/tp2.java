package tp2;

import java.util.Date;

public class tp2 {

   
    public static void main(String[] args) {
   
        Date fecha = new Date();
        //devuelve la fecha actual
        System.out.println(FuncionesPrograma.getFechaString(fecha));

        System.out.println(FuncionesPrograma.getFechaDate(12, 9, 9));
    }
        

}
