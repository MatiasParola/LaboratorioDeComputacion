package tp2;

public class Uno {
   
    
    public static void main(String[] args) {
        
        double valorDecimal;
        valorDecimal = 39356768678434725623464.23144422676788965784356d;
        
        short chico = (short) valorDecimal;
        System.out.println(chico + " short");
        int entero = (int) valorDecimal;
        System.out.println(entero + " int");
        long largo = (long) valorDecimal;
        System.out.println(largo + " long");
        String cadena = String.valueOf(valorDecimal);
        System.out.println(cadena + " String");
        float flotante = (float) valorDecimal;
        System.out.println(flotante + " float");
    
    
        
    }
    
}
