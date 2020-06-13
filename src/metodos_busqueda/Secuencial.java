/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_busqueda;

/**
 *
 * @author Admin
 */
public class Secuencial {
    public int getPosition (int K[], int prmClave) {
        int X = -1;
        
        for (int i = 0; i < K.length; i++) {
            if (K[i] == prmClave) {
                X = i;
                break;
            }
        }
        return X;
    }
}
