package tp2;

public class Calculo {

   
    public static void main(String[] args) {
   
        OperacionMatematica calculo = new OperacionMatematica();
        
        calculo.setValor1(20d);
        calculo.setValor2(35d);
    
        System.out.println(calculo.aplicarOperacion("+"));
        System.out.println(calculo.aplicarOperacion("-"));
        System.out.println(calculo.aplicarOperacion("*"));
        System.out.println(calculo.aplicarOperacion("/"));
        

     }

}
