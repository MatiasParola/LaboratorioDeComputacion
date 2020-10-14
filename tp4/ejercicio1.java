/*
 * 1- Explique brevemente en qué consisten los siguientes Algoritmos Fundamentales.
    Algoritmos de Ordenación:
    Ordenamiento por Inserción:
    El algoritmo de ordenamiento por inserción es un algoritmo de fácil aplicación que permite el ordenamiento de una lista.
    Su funcionamiento consiste en el recorrido por la lista seleccionando en cada iteración un valor como clave y compararlo con el resto insertándolo en el lugar correspondiente.

     Algoritmo de la burbuja:
    Comenzando desde el inicio del arreglo, se compara cada par de elementos adyacentes. Si ambos no están ordenados (el segundo es menor que el primero), se intercambian sus posiciones. 
    En cada iteración, un elemento menos necesita ser evaluados (el último), ya que no hay más elementos a su derecha que necesiten ser comparados, puesto que ya están ordenados

     Ordenamiento por selección:
    Algoritmo de ordenamiento por Selección (Selection Sort en inglés): Consiste en encontrar el menor de todos los elementos del arreglo o vector e intercambiarlo con el que está en la primera posición.
    
     Algoritmo Quick-Sort:
    El algoritmo consta de los siguientes pasos:

    Elegir un elemento de la lista de elementos a ordenar, al que llamaremos pivote.
    Resituar los demás elementos de la lista a cada lado del pivote, de manera que a un lado queden todos los menores que él, y al otro los mayores. 
    Los elementos iguales al pivote pueden ser colocados tanto a su derecha como a su izquierda, dependiendo de la implementación deseada. En este momento, el pivote ocupa exactamente el lugar que le corresponderá en la lista ordenada.
    La lista queda separada en dos sublistas, una formada por los elementos a la izquierda del pivote, y otra por los elementos a su derecha.
    Repetir este proceso de forma recursiva para cada sublista mientras éstas contengan más de un elemento. Una vez terminado este proceso todos los elementos estarán ordenados.

Algoritmos de Búsqueda:
     Búsqueda Secuencial:
    Búsqueda secuencial comprueba secuencialmente cada elemento de la lista hasta que encuentra un elemento que coincide con el valor de objetivo. 
    Si el algoritmo llega al fin de la lista sin encontrar el objetivo, la búsqueda termina insatisfactoriamente.

     Búsqueda Binaria:
    La búsqueda binaria funciona en arreglos ordenados. La búsqueda binaria comienza por comparar el elemento del medio del arreglo con el valor buscado. 
    Si el valor buscado es igual al elemento del medio, su posición en el arreglo es retornada. 
    Si el valor buscado es menor o mayor que el elemento del medio, la búsqueda continua en la primera o segunda mitad, respectivamente, dejando la otra mitad fuera de consideración.


Algoritmos de Recorrido:
     En el recorrido en profundidad, el proceso exige un camino desde el nodo raıź a
    través de un hijo, al descendiente más lejano del primer hijo antes de proseguir a 
    un segundo hijo. En otras palabras, en el recorrido en profundidad, todos los
    descendientes de un hijo se procesan antes del siguiente hijo. Para saber cómo
    regresarnos, vamos guardando los nodos visitados en una estructura de pila. Es por
    esto que se acostumbra programar esta búsqueda de forma recursiva, con lo que el
    manejo de la pila lo realiza el lenguaje de programación utilizado    

     Recorrido de Anchura:
    En el recorrido en anchura, el proceso se realiza horizontalmente desde el raıź a
    todos sus hijos, a continuación, a los hijos de sus hijos y así ́ sucesivamente hasta
    que todos los nodos han sido procesados. En otras palabras, en el recorrido en
    anchura, cada nivel se procesa totalmente antes de que comience el siguiente
    nivel. Para poder saber qué vértices visitar, utilizamos una cola. 

 */
package tp4;

/**
 *
 * @author artur
 */
public class ejercicio1 {

 
    public static void main(String[] args) {
      
        /*
        Ordenamiento por Inserción: consiste en empezar por el valor en la posicion cero,
        luego en la 1 luego en la 2 y asi sucesivamente.
        A cada iteracion que se realiza se compara el valor con los valores en las
        posiciones del array que se encuentran a su izquierda. En el caso de que dicho 
        valor sea menor(o mayor) se intercambia de lugar. 
        La operacion se repite hasta que se hayan evaluado todos los valores del arreglo.
        Cuando se haya terminado, el arreglo quedara ordenado
        
        Algoritmo de la burbuja: consiste en ir comparando de a 2 valores del arreglo.
        Dentro del bucle (por ejemplo for) se compara la posicion 1 vs la 2 , y si es 
        menor (o mayor) se intercambian mediante el uso de una variable auxiliar.
        En la siguiente vuelta de bucle se comparará la posicion 2 vs la 3, y el proceso
        se repite.
        Una vez que se haya recorrido todo el array, el mismo quedara ordenado.
        
        Ordenamiento por selección:
        
        
        
        
        
        
        */
    }
    
}
