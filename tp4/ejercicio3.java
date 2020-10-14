/*
 * 3- Modifique los algoritmos de ordenamiento anteriores (inserción, burbuja, selección)
    para que además de la lista a ordenar revisan como parámetro un “String orden”, cuyo
    valor será “ASC” o “DESC”, que permita definir si la lista debe ordenarse de forma
    ASCENDENTE o DESCENDENTE.

 */
package tp4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Ingrese 'asc' para que se ordene el array aleatorio de forma ascendiente, "
                + "de otra forma se ordenara decreciente");
        Scanner sc = new Scanner (System.in);
        String orden= sc.nextLine();
        ordenamiendoPorInsercion(creaArrayDesordenado(), orden);
        ordenamiendoPorSeleccion(creaArrayDesordenado(), orden);
        algoritmoDeLaBurbuja(creaArrayDesordenado(), orden);
    }

    public static int[] creaArrayDesordenado() {

        Random random = new Random();

        int array[] = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("ARRAY DESORDENADO: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        return array;
    }

    public static int[] algoritmoDeLaBurbuja(int arreglo[], String orden) {

        if (orden.equalsIgnoreCase("asc")) {

            int menor;
            for (int i = 0; i < (arreglo.length - 1); i++) {
                for (int j = 0; j < (arreglo.length - 1); j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        menor = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = menor;
                    }
                }
            }

            System.out.println("ARRAY ORDENADO CRECIENTE. BURBUJA");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println("");

            return arreglo;
        } else {

            int mayor;

            for (int i = 0; i < (arreglo.length - 1); i++) {
                for (int j = 0; j < (arreglo.length - 1); j++) {
                    if (arreglo[j] < arreglo[j + 1]) {
                        mayor = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = mayor;
                    }
                }
            }
            System.out.println("ARRAY ORDENADO DECRECIENTE. BURBUJA");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println("");

            return arreglo;
        }

        //otra forma de resolverlo sin burbuja seria
        //Arrays.sort(arreglo);
    }

    public static int[] ordenamiendoPorInsercion(int arr[], String orden) {
       
        if (orden.equalsIgnoreCase("asc")) {

            for (int i = 0; i < arr.length; i++) {
                int aux = arr[i];
                int posicion = i;

                while (posicion > 0 && arr[posicion - 1] > aux) {
                    arr[posicion] = arr[posicion - 1];
                    posicion--;
                }
                arr[posicion] = aux;
            }
            System.out.println("ARRAY ORDENADO CRECIENTE. INSERCION");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            return arr;
        } else {

            for (int i = 0; i < arr.length; i++) {
                int aux = arr[i];
                int posicion = i;

                while (posicion > 0 && arr[posicion - 1] < aux) {
                    arr[posicion] = arr[posicion - 1];
                    posicion--;
                }
                arr[posicion] = aux;
            }
            System.out.println("ARRAY ORDENADO DECRECIENTE. INSERCION");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
            return arr;

        }

    }

    public static int[] ordenamiendoPorSeleccion(int arr[], String orden) {
       
        if (orden.equalsIgnoreCase("asc")) {

            for (int i = 0; i < arr.length - 1; i++) {
                int menor = arr[i];

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < menor) {
                        menor = arr[j];
                        int aux = arr[i];
                        arr[i] = arr[j];
                        arr[j] = aux;
                    }
                }
            }

            System.out.println("ARRAY ORDENADO CRECIENTE. SELECCION");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");

            return arr;

        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                int menor = arr[i];

                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] > menor) {
                        menor = arr[j];
                        int aux = arr[i];
                        arr[i] = arr[j];
                        arr[j] = aux;
                    }
                }
            }

            System.out.println("ARRAY ORDENADO DECRECIENTE. SELECCION");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");

            return arr;

        }
    }
}
