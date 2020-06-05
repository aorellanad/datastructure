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
public class Direct_Insertion {
    public int[] toSort(int rNumbers[]) {
        int i, j;
        int aux;
        for (i = 1; i < rNumbers.length; i++) {
            /* indice j es para explorar la sublista a[i-1]..a[0] 
            buscando la  posicion correcta del  elemento destino*/
            j = i;
            aux = rNumbers[i];
            // se localiza el punto de inserciÃ³n explorando hacia abajo
            while (j > 0 && aux < rNumbers[j - 1]) {
                // desplazar elementos hacia arriba para hacer espacio
               rNumbers [j] = rNumbers[j - 1];
                j--; 
            }
            rNumbers[j] = aux;
        }
        return rNumbers;
    }
    
}
    

