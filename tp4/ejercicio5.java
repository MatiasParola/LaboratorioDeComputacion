/*
 * 5- Codifique un algoritmo que solicite un 2 valores enteros mayores o iguales a 2, que se
    corresponden a cantidad de filas y columnas. Cree un arreglo de tamaño[X,Y]de tipo
    entero, el tamaño se corresponde a los 2 valores enteros ingresados inicialmente.
    Solicite al usuario que ingrese números enteros para cargar cada una de las celdas de
    la matriz. Finalizada la carga calcule el promedio entero de los elementos asignados y
    cargados en la matriz. Para terminar determine si el promedio calculado se encuentra
    asignado en alguna de las celdas, si es así indique la posición o posiciones
    correspondientes, caso contrario muestre el mensaje “No se encontró ninguna
    coincidencia”.
 */
package tp4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class ejercicio5 {

    public static void main(String[] args) {

        int matriz[][] = creaMatriz();
        int promedio = calculaPromedioDeMatriz(matriz);
        busquedaSecuencial(matriz, promedio);

    }

    public static int[][] creaMatriz() {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("INTRODUZCA 2 NUMEROS ENTEROS, LOS CUALES SERAN LAS DIMENSIONES DE LA MATRIZ");
        x = sc.nextInt();
        y = sc.nextInt();
        while (x < 2 || y < 2) {
            System.out.println("LA MATRIZ DEBE SER DE POR LO MENOS 2 FILAS Y 2 COLUMNAS");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        Random random = new Random();

        int matriz[][] = new int[x][y];
        int largo_filas = matriz.length;
        int largo_columnas = matriz[0].length;

        for (int i = 0; i < largo_filas; i++) {
            for (int j = 0; j < largo_columnas; j++) {
                matriz[i][j] = random.nextInt(15) + 1;

            }
        }

        System.out.println("Matriz desordenada: ");

        for (int i = 0; i < largo_filas; i++) {
            System.out.println("");
            for (int j = 0; j < largo_columnas; j++) {
                System.out.print("[ " + matriz[i][j] + " ] ");
            }

        }
        System.out.println("\n");

        return matriz;
    }

    public static int calculaPromedioDeMatriz(int matriz[][]) {

        int total = 0;
        int largo_filas = matriz.length;
        int largo_columnas = matriz[0].length;
        for (int i = 0; i < largo_filas; i++) {
            for (int j = 0; j < largo_columnas; j++) {
                total += matriz[i][j];
            }
        }
        int promedio = total / (largo_columnas * largo_columnas);
        System.out.println("EL PROMEDIO DE LOS VALORES DE LA MATRIZ ES " + promedio + "\n");

        return promedio;

    }

    public static void busquedaSecuencial(int matriz[][], int promedio) {

        boolean encontrar = false;
        int largo_filas = matriz.length;
        int largo_columnas = matriz[0].length;
        int fila_encontrada = 0;
        int columna_encontrada = 0;
        int valor_buscado = promedio;
        for (int i = 0; i < largo_filas; i++) {
            for (int j = 0; j < largo_columnas; j++) {

                if (valor_buscado == matriz[i][j]) {
                    encontrar = true;
                    fila_encontrada = i;
                    columna_encontrada = j;
                }
            }
        }
        if (encontrar) {
            System.out.println("valor encontrado en la fila " + (fila_encontrada + 1) + " y en la columna " + (columna_encontrada + 1));
        } else {
            System.out.println("el valor no se encuentra en el array evaluado");
        }

    }
}
