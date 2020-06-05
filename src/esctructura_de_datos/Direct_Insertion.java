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
      public static void main(String[] args) {
        int[] a = {7, 4, 1, 5, 3, 2,10};
        ordInsercion(a);
    }
    public static void ImprimirArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.println("");
    }
    public static void ordInsercion(int[] a) {
        int i, j;
        int aux;
        ImprimirArr(a);
        for (i = 1; i < a.length; i++) {
            /* indice j es para explorar la sublista a[i-1]..a[0] 
            buscando la  posicion correcta del  elemento destino*/
            j = i;
            aux = a[i];
            // se localiza el punto de inserciÃ³n explorando hacia abajo
            while (j > 0 && aux < a[j - 1]) {
                // desplazar elementos hacia arriba para hacer espacio
                a[j] = a[j - 1];
                j--; 
            }
            a[j] = aux;
        }
        ImprimirArr(a);
    }
    
}
    

