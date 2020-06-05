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
    /* public static void main(String[] args){
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
    }*/
    
    public static void intercambiar(int rNumbers[], int i , int j){
        int aux= rNumbers[i];
        rNumbers[i]=rNumbers[j];
        rNumbers[j]=aux;
    }
    
    private static void OrdQuickSort(int rNumbers[], int primero, int ultimo){
    int i, j, central;
    double pivote;
    central=(primero+ultimo)/2;
    pivote= rNumbers [central];
    i=primero;
    j=ultimo;
    
        do {
            while(rNumbers[i]<pivote){
                i++;
            }
            while(rNumbers[j]>pivote){
                j--;
            }
            if (i<=j) {
                intercambiar(rNumbers,i,j);
                i++;
                j--;
            }
        } while (i<=j);
        if (primero<j) {
            OrdQuickSort(rNumbers,primero,j); //mismo proceso con sublista izqda
            
        }
        if (i<ultimo) {
            OrdQuickSort(rNumbers,i,ultimo); //mismo proceso con sublista drcha
            
        }
    }
    public int toSort(int rNumbers[]){
        
        return rNumbers;
    }
    
}
