package esctructura_de_datos;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] rNumbers = {5,89,12,4,3};
        Bubble bubble = new Bubble();
        Direct_Insertion Di=new Direct_Insertion();
        // print messy array
        System.out.println(Arrays.toString(rNumbers));
        // print sort array
        System.out.println(Arrays.toString(bubble.toSort(rNumbers)));
        System.out.println(Arrays.toString(Di.toSort(rNumbers)));
        
    }
}
