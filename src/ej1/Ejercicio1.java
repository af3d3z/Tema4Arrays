package ej1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // guardaremos el tamaño del array
        int N;
        // guardaremos el valor
        int M;
        // array de números
        int[] array;
        Scanner sc = new Scanner(System.in);

        // preguntamos los datos al array
        System.out.println("¿Cúantos números debería poder albergar la tabla?");
        N = sc.nextInt();
        System.out.println("¿Qué valor deberá de tener la tabla en todas sus posiciones?");
        M = sc.nextInt();

        // creamos el array de N números
        array = new int[N];
        // rellenamos el array con el valor asignado
        Arrays.fill(array, M);
        // mostramos el array por pantalla
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
