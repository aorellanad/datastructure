package esctructura_de_datos;

import java.util.Arrays;
import metodos_busqueda.Secuencial;

public class main {
    public static void main(String[] args) {
        int[] rNumbers = {5,89,12,4,3};
        Bubble bubble = new Bubble();
        Direct_Insertion Di=new Direct_Insertion();
        Seleccion select=new Seleccion();
        Shell_sort Sh = new Shell_sort();
        Merge_sort Ms = new Merge_sort();
        Quick_sort Qs = new Quick_sort();
        //Metodos de Busqueda
        Secuencial Sc = new Secuencial();
        // print messy array
        System.out.println(Arrays.toString(rNumbers));
        // print sort array
        System.out.println("Burbuja");
        System.out.println(Arrays.toString(bubble.toSort(rNumbers)));
        System.out.println("Insercion");
        System.out.println(Arrays.toString(Di.toSort(rNumbers)));
        System.out.println("Seleccion");   
        System.out.println(Arrays.toString(select.toSort(rNumbers)));
        System.out.println("Shell sort");
        System.out.println(Arrays.toString(Sh.toSort(rNumbers)));
        System.out.println("Merge sort");
        System.out.println(Arrays.toString(Ms.toSort(rNumbers)));
        System.out.println("Quick sort");
        System.out.println(Arrays.toString(Qs.toSort(rNumbers)));
        // print Metodos de Busqueda
        System.out.println("Secuencial");
        System.out.println(Sc.getPosition(rNumbers, 12));
    }
}
