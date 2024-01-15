package ej4;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        // donde se guardarán los 30 números aleatorios
        int[] array = new int[30];

        // recorremos el array y generamos todos los números aleatorios por cada posición
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        // ordenamos el array de manera ascendente
        Arrays.sort(array);

        // mostramos el array por pantalla
        System.out.println(Arrays.toString(array));
    }
}
