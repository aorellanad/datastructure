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
public class Quicksort {
     public static void main(String[] args){
        double [] a={7,4,1,5,3,2};
        ImprimirArr(a);
        OrdQuickSort(a,0,a.length-1);
        ImprimirArr(a);
    }
    
    public static void ImprimirArr(double[]a){
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t"+a[i]);
        }
        System.out.println("");
    }
    
    public static void intercambiar(double[]a, int i , int j){
        double aux= a[i];
        a[i]=a[j];
        a[j]=aux;
    }
    
    private static void OrdQuickSort(double a[], int primero, int ultimo){
    int i, j, central;
    double pivote;
    central=(primero+ultimo)/2;
    pivote= a [central];
    i=primero;
    j=ultimo;
    
        do {
            while(a[i]<pivote){
                i++;
            }
            while(a[j]>pivote){
                j--;
            }
            if (i<=j) {
                intercambiar(a,i,j);
                i++;
                j--;
            }
        } while (i<=j);
        if (primero<j) {
            OrdQuickSort(a,primero,j); //mismo proceso con sublista izqda
            
        }
        if (i<ultimo) {
            OrdQuickSort(a,i,ultimo); //mismo proceso con sublista drcha
            
        }
    }
    
}
