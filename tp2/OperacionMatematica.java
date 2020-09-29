package tp2;



public class OperacionMatematica {

    private Double valor1, valor2;
    private String operacion;
    
    //constructores
    public OperacionMatematica(double valor1, double valor2, String operacion){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacion = operacion;
    }
    
    public OperacionMatematica(){
        
    }
    
    
    //Getter and Setter
    public String getOperacion() {
        return operacion;
    }
    
    public void setOperacion(String operacion){
        this.operacion = operacion;
    }
    
    public Double getValor1(){
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }
    
    public Double getValor2(){
        return valor2;
    }
    
    public void setValor2(Double valor2){
        this.valor2 = valor2;
    }
    
    //Metodos
    
    private double sumarNumeros(){
        return valor1 + valor2;
    }   
    
    private double restarNumeros(){
        return valor1 - valor2;
    }
    
    private double multiplicarNumeros(){
        return valor1 * valor2;
    }
    
    private double dividirNumeros(){
        return valor1 / valor2;
    }
    
    public double aplicarOperacion(String operacion){
        double resultado;
        
        switch(operacion){
            
            case "+" : resultado = sumarNumeros(); break;
            
            case "-" : resultado = restarNumeros(); break;
            
            case "*" : resultado = multiplicarNumeros(); break;
            
            case "/" : resultado = dividirNumeros(); break;
            
            default : resultado = 0;
            
        }
     return resultado;   
    }
}
