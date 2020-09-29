package tp2;

import java.util.Scanner;
public class Cuatro {

    
    public static void main(String[] args) {
        float monto;
        Scanner x = new Scanner(System.in);
        
        System.out.println("Ingrese el monto a dar un vuelto");
        monto = x.nextFloat();
        System.out.println(monto);
        vuelto(monto);
        
        
        
        
    }
    //se encarga de contar los billetes y el vuelto
    public static void vuelto(float monto){
        int cont200=0, cont100=0, cont50=0, cont20=0, cont10=0, cont5=0,
                cont2=0, cont1=0, cont050=0, cont025 =0, cont010 =0, cont005 =0;
        float resto = monto;
        while(resto>0){
            if(resto>=200){
                resto = resto - 200;
                cont200 = cont200 + 1;
            }   else if(resto>=100){
                    resto = resto - 100;
                    cont100 = cont100 + 1;
                }   else if(resto>=50){
                        resto = resto - 50;
                        cont50 = cont50 + 1;
                    }   else if(resto>=20){
                            resto = resto - 20;
                            cont20 = cont20 + 1;
                        }   else if(resto>=10){
                                resto = resto - 10;
                                cont10 = cont10 + 1;
                            }   else if(resto>=5){
                                    resto = resto - 5;
                                    cont5 = cont5 + 1;
                                }   else if(resto>=2){
                                        resto = resto - 2;
                                        cont2 = cont2 + 1;
                                    }   else if(resto>=1){
                                            resto = resto - 1;
                                            cont1 = cont1 + 1;
                                        }   else if(resto>=0.50){
                                                resto = resto - 0.50f;
                                                cont050 = cont050 + 1;
                                            }   else if(resto>=0.25){
                                                    resto = resto - 0.25f;
                                                    cont025 = cont025 + 1;
                                                }   else if(resto>=0.10){
                                                        resto = resto - 0.10f;
                                                        cont010 = cont010 + 1;
                                                    }   else if(resto>=0.05){
                                                    resto = resto - 0.05f;
                                                    cont005 = cont005 + 1;
                                                    break;
                                                }else break;
        }
        System.out.println("Cantidad de 200= " + cont200);
        System.out.println("Cantidad de 100= " + cont100);
        System.out.println("Cantidad de 50= " + cont50);
        System.out.println("Cantidad de 20= " + cont20);
        System.out.println("Cantidad de 10= " + cont10);
        System.out.println("Cantidad de 5= " + cont5);
        System.out.println("Cantidad de 2= " + cont2);
        System.out.println("Cantidad de 1= " + cont1);
        System.out.println("Cantidad de 0.50= " + cont050);
        System.out.println("Cantidad de 0.25= " + cont025);
        System.out.println("Cantidad de 0.10= " + cont010);
        System.out.println("Cantidad de 0.05= " + cont005);
 
    }
    //Disculpe profe me enrosque haciendo el ejercicio era muy simple, con un par de modulos lo tenia
}
