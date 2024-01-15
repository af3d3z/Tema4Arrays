package ej3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // array donde se guardarán los primeros 10 números
        int[] array0 = new int[10];
        // array donde se guardarán los últimos 10 números
        int[] array1 = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array0.length; i++){
            System.out.println("(1) - (" + i + ") Introduce un número: ");
            array0[i] = sc.nextInt();
        }

        for(int i = 0; i < array1.length; i++){
            System.out.println("(2) - (" + i + ") Introduce un número: ");
            array1[i] = sc.nextInt();
        }

        System.out.println(Arrays.equals(array0, array1) ? "Las tablas son iguales." : "Las tablas no son iguales");
    }
}
