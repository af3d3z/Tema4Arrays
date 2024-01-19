package ej7;

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        // esta variable guarda la combinación ganadora
        int[] ganador = {4, 5, 6, 8, 18, 68};
        // esta variable guarda un array de números aleatorios
        int[] apuesta = new int[6];
        // guardará el número de aciertos
        int nAciertos = 0;

        // generamos los números aleatorios de la variable apuesta
        for(int i = 0; i < apuesta.length; i++) {
            apuesta[i] = (int) (Math.random() * 49) + 1;
        }

        // contamos las veces que coincide cada número con el boleto ganador
        for(int i = 0; i < apuesta.length; i++){
            for(int j = 0; j < apuesta.length; j++) {
                if(apuesta[j] == ganador[i])
                    nAciertos++;
            }
        }

        System.out.println("Ganador: " + Arrays.toString(ganador) + '\n' + "Apuesta: " + Arrays.toString(apuesta));
        System.out.println("Aciertos: " + nAciertos);

    }
}
