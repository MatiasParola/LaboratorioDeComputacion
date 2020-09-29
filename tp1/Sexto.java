package tp1;

import java.util.Scanner;

public class Sexto {

    
    public static void main(String[] args) {
        
        double precio, total;
        final double IVA = 0.21;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese el precio neto");
        precio = x.nextDouble();
        
        total = precio + (precio * IVA);
        System.out.println("Su valor final es "+ total);
    }
    
}
