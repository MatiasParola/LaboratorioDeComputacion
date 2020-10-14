/*
 * 4- Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos
enteros. Finalizada la carga de los 20 elementos el programa debe solicitar como se
desea ordenar el array ASCENDENTE O DESCENDENTE y que método de ordenamiento
aplicar (inserción, burbuja, selección), según las opciones elegidas aplique el
algoritmos fundamental de ordenamiento que corresponda. Muestre por pantalla el
array original desordenado y su resultante ordenado según las opciones elegidas.

 */
package tp4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class ejercicio4 {

    public static void main(String[] args) {
        ordenaArray(creaArrayDesordenado());
    }

    public static int[] creaArrayDesordenado() {

        Random random = new Random();

        int array[] = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }

        System.out.println("ARRAY DESORDENADO: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        return array;
    }

    public static void ordenaArray(int arreglo[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Elija si quiere su array en forma ascendente o descendiente. Coloque 'asc' para ascendente o 'desc' para descendente");

        String eleccion = sc.nextLine();
        while (!eleccion.equalsIgnoreCase("asc") && !eleccion.equalsIgnoreCase("desc")) {
            System.out.println("Comando no reconocido. Coloque 'asc' para ascendente o 'desc' para descendente");
            eleccion = sc.nextLine();
        }
        System.out.println("Elija que tipo de ordenamiento desea usar. Coloque 'burbuja' para usar el metodo de la burbuja o 'insercion' para el metodo de la insercion");
        String metodo = sc.nextLine();
        while (!metodo.equalsIgnoreCase("burbuja") && !metodo.equalsIgnoreCase("insercion")) {
            System.out.println("Comando no reconocido. Coloque 'burbuja' para usar el metodo de la burbuja o 'insercion' para el metodo de la insercion");
            metodo = sc.nextLine();
        }
        if (eleccion.equalsIgnoreCase("asc")) {

            if (metodo.equalsIgnoreCase("burbuja")) {
                algoritmoDeLaBurbujaAscendente(arreglo);
            } else {
                ordenamiendoPorInsercionAscendente(arreglo);
            }
        } else {
            if (metodo.equalsIgnoreCase("burbuja")) {
                algoritmoDeLaBurbujaDescendiente(arreglo);
            } else {
                ordenamiendoPorInsercionDescendiente(arreglo);
            }
        }
    }

    public static void algoritmoDeLaBurbujaAscendente(int arreglo[]) {

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

        System.out.println("ARRAY ORDENADO CRECIENTE CON METODO DE LA BURBUJA");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }

    public static void algoritmoDeLaBurbujaDescendiente(int arreglo[]) {

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
        System.out.println("ARRAY ORDENADO DECRECIENTE METODO DE LA BURBUJA");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }

    public static void ordenamiendoPorInsercionAscendente(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int aux = arr[i];
            int posicion = i;

            while (posicion > 0 && arr[posicion - 1] > aux) {
                arr[posicion] = arr[posicion - 1];
                posicion--;
            }
            arr[posicion] = aux;
        }
        System.out.println("ARRAY ORDENADO CRECIENTE CON ORDENAMIENTO POR INSERCION");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

    }

    public static void ordenamiendoPorInsercionDescendiente(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int aux = arr[i];
            int posicion = i;

            while (posicion > 0 && arr[posicion - 1] < aux) {
                arr[posicion] = arr[posicion - 1];
                posicion--;
            }
            arr[posicion] = aux;
        }
        System.out.println("ARRAY ORDENADO DECRECIENTE CON ORDENAMIENTO POR INSERCION");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

    }
}
