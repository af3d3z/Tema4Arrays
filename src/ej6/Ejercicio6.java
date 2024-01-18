package ej6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // guardará 1000 números aleatorios
        int[] aleatorios = new int[1000];
        // guardará el número a buscar
        int aBuscar;
        // guardará el número de ocurrencias en el array
        int ocurrencias = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Generando números:");
        // generación de números aleatorios
        for(int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random() * 100);
        }

        // obtenemos del usuario el númeroº
        System.out.println("Introduce un número:");
        aBuscar = sc.nextInt();

        for(int i = 0; i < aleatorios.length; i++) {
            if(aleatorios[i] == aBuscar)
                ocurrencias++;
        }

        System.out.println("El valor " + aBuscar + " aparece " + ocurrencias + " veces.");
        sc.close();
    }
}
