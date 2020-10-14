/*
 * 2- Codifique mediante código JAVA los pseudocódigos de los algoritmos fundamentales
presentados en el apunte “Algoritmos Fundamentales” correspondiente.
 Ordenamiento por inserción
 Algoritmo de la burbuja
 Ordenamiento por selección
 Búsqueda secuencial

 */
package tp4;

import java.util.Random;

/**
 *
 * @author artur
 */
public class ejercicio2 {

    public static void main(String[] args) {

        busquedaSecuencial(creaArrayDesordenado(), 5);

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

    public static int[] ordenamiendoPorInsercion(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int aux = arr[i];
            int posicion = i;

            while (posicion > 0 && arr[posicion - 1] > aux) {
                arr[posicion] = arr[posicion - 1];
                posicion--;
            }
            arr[posicion] = aux;
        }
        System.out.println("ARRAY ORDENADO CRECIENTE");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }

    public static int[] algoritmoDeLaBurbuja(int arreglo[]) {
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

        System.out.println("ARRAY ORDENADO CRECIENTE");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");

        return arreglo;
        //otra forma de resolverlo sin burbuja seria
        //Arrays.sort(arreglo);
    }

    public static int[] ordenamiendoPorSeleccion(int arr[]) {
        
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

        System.out.println("ARRAY ORDENADO CRECIENTE");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        return arr;

    }

    public static void busquedaSecuencial(int arr[], int valor_buscado) {

        boolean encontrar = false;
        int largo = arr.length;
        int lugar_encontrado = 0;
        for (int i = 0; i < largo; i++) {
            if (valor_buscado == arr[i]) {
                encontrar = true;
                lugar_encontrado = i;
            }
        }
        if (encontrar) {
            System.out.println("valor encontrado en el lugar " + (lugar_encontrado + 1));
        } else {
            System.out.println("el valor no se encuentra en el array evaluado");
        }

    }

}
