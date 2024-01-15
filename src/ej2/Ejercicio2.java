package ej2;

import java.util.Arrays;

public class Ejercicio2 {
    /*
    * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces el 10, y luego la muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
    * */
    // se encarga de calcular el tamaño del array en base al número dado
    static int calculaTamanio(int num){
        int total = 0;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        // guarda el tamaño del array a crear
        int tamanio = 10;
        // creamos e inicializamos el array con el tamaño introducido
        int[] array = new int[calculaTamanio(tamanio)];

        // guardamos la posición mínima
        int posMin = 0;
        // guardamos la posición máxima
        int posMax = 0;
        // 1 2 2 3 3 3

        for(int i = 1; i <= tamanio; i++){
            // sumamos la posición máxima con el iterador
            posMax += i;
            // rellenamos desde la posición mínima a la máxima con el iterador
            Arrays.fill(array, posMin, posMax, i);
            // le asignamos el valor de la posición máxima a la posición mínima
            posMin = posMax;
        }
        // imprimimos el array
        System.out.println(Arrays.toString(array));
    }
}
