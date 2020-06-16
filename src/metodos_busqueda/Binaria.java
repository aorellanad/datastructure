/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_busqueda;

/**
 *
 * @author Andrade Bravo
 */
public class Binaria {
    public int getPosition (int K[], int prmClave) {
        int X = -1;
        int central, bajo, alto, valorCentral ;
        bajo = 0;
        alto = K.length -1; 
        while (bajo <= alto) {
            central = (bajo + alto)/2;
            valorCentral = K[central];
            if(prmClave == valorCentral) {
                X = central;
                break;
            } else if (prmClave < valorCentral) {
                alto = central -1;
            } else {
                bajo = central + 1;
            }
        }
    
        return X;
    }
}
