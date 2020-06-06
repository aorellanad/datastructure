/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esctructura_de_datos;

/**
 *
 * @author Steven
 */
public class Seleccion {
       public int[] toSort(int rNumbers[]) {
        int indiceMenor, i, j, n;
        n = rNumbers.length;
        // comienzo de la exploraciÃ³n en Ã­ndice i
        for (i = 0; i < n - 1; i++) {             
            indiceMenor = i;
            // j explora la sublista a[i+1]..a[n-1]
            for (j = i + 1; j < n; j++) {
                if (rNumbers[j] < rNumbers[indiceMenor]) {
                    indiceMenor = j;
                }
                // sitÃºa el elemento mas pequeÃ±o en a[i]
            }
            if (i != indiceMenor) {
                intercambiar(rNumbers, i, indiceMenor);
            }
        }
        return rNumbers;
    }
    public static void intercambiar(int rNumbers[], int i, int j) {
        int aux = rNumbers[i];
        rNumbers[i] = rNumbers[j];
        rNumbers[j] = aux;
    }
}
