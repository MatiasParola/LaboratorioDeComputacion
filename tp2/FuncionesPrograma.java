package tp2;

import java.util.Date;

public class FuncionesPrograma {
    
    
    public static String getFechaString(Date fecha){
        
        
        return fecha.toString();
    } 
    
    public static Date getFechaDate(int dia, int mes, int anio){
        Date fecha = new Date(anio,mes,dia);
    
    
    return fecha;
    }
    
    
}
