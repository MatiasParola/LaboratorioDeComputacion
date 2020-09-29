package tp2;



public class Fraccion {
    
    private int numerador, denominador;
    
    //Constructor
    
    public Fraccion(int numerador, int denominador){
        this.denominador = denominador;
        this.numerador = numerador;
    }
    
    //Metodos
    
    public static Fraccion sumarFraccion(Fraccion f1, Fraccion f2){
        int aux1 =  f1.denominador * f2.numerador;
        int aux2 = f2.denominador * f1.numerador;
        
        int numeradorau = aux1 + aux2;
        
        int denominadorau = f1.denominador * f2.denominador;
        
        Fraccion resultado = new Fraccion(numeradorau, denominadorau);
        
        return resultado;
    }
   
     public static Fraccion restarFraccion(Fraccion f1, Fraccion f2){
        int aux1 =  f1.denominador * f2.numerador;
        int aux2 = f2.denominador * f1.numerador;
        
        int numeradorau = aux1 - aux2;
        
        int denominadorau = f1.denominador * f2.denominador;
        
        Fraccion resultado = new Fraccion(numeradorau, denominadorau);
        
        return resultado;
    }
     
      public static Fraccion multiplicarFraccion(Fraccion f1, Fraccion f2){
        int denominadorau =  f1.denominador * f2.denominador;
        int numeradorau = f2.numerador * f1.numerador;
        
        Fraccion resultado = new Fraccion(numeradorau, denominadorau);
        
        return resultado;
    }
   
    public static Fraccion dividirFraccion(Fraccion f1, Fraccion f2){
        int denominadorau =  f2.denominador * f2.numerador;
        int numeradorau = f1.numerador * f2.denominador;
        
        Fraccion resultado = new Fraccion(numeradorau, denominadorau);
        
        return resultado;
    }

    @Override
    public String toString() {
        return "Fraccion{" + numerador + " / " + denominador + '}';
    }
    
    
   
}
