
package esctructura_de_datos;

/**
 *
 * @author Joel Tito
 */
public class Shell_sort {
    public int[] toSort(int rNumbers[]) {
        
        OrdenamientoShell(rNumbers);

        return rNumbers;
    }
    
    public void OrdenamientoShell(int[] a) {
        int salto, aux, i;
        boolean cambios;
        for (salto = a.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;

                for (i = salto; i < a.length; i++) {
                    if (a[i - salto] > a[i]) {
                        aux = a[i];
                        a[i] = a[i - salto];
                        a[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
    }
}
