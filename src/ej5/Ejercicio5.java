package ej5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static int[] reverseSort(int[] array) {
        // guardaremos una copia del array
        int[] numeros = new int[array.length];
        numeros = Arrays.copyOf(array, array.length);
        // guardará temporalmente el valor de un índice para cambiarlo de posición
        int temp = 0;
        for(int i = 0; i < numeros.length; i++) {
            for(int j = i+1; j < numeros.length; j++) {
                if(numeros[i] < numeros[j]) {
                    temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        return numeros;
    }

    public static void main(String[] args) {
        // guardará la puntuación de los 8 jugadores
        int[] puntJugadores = new int[8];
        // guardará temporalmente la puntuación de cada jugador
        int puntuacion = 0;
        Scanner sc = new Scanner(System.in);

        // pregunta al usuario 8 veces por un número entre 1000 y 2800
        for(int i = 0; i < puntJugadores.length; i++) {
            do{
                try{
                    System.out.printf("(%d) " + "Introduce la puntuación del jugador (1000 - 2800)\n", i + 1);
                    puntuacion = sc.nextInt();
                }catch(InputMismatchException e){
                    System.err.println("Dato erroneo.");
                    sc.nextLine();
                }
            }while(puntuacion < 1000 || puntuacion > 2800);
            puntJugadores[i] = puntuacion;
        }
        // muestra por pantalla el array ordenado de mayor a menor
        System.out.println(Arrays.toString(reverseSort(puntJugadores)));
    }
}
