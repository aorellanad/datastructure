package esctructura_de_datos;

/**
 *
 * @author joel tito
 */
public class Quick_sort {

    public int[] toSort(int rNumbers[]) {
        OrdQuickSort(rNumbers, 0, rNumbers.length - 1);

        return rNumbers;
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    private static void OrdQuickSort(int a[], int primero, int ultimo) {
        int i, j, central;
        int pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;
        do {
            while (a[i] < pivote) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            OrdQuickSort(a, primero, j); // mismo proceso con sublista izqda
        }
        if (i < ultimo) {
            OrdQuickSort(a, i, ultimo); // mismo proceso con sublista drcha
        }
    }
}
