package br.ufg.inf.es.construcao.dividearray;

import br.ufg.inf.es.construcao.somaarray.SomaArray;

/**
 * 
 */
public class DivideArray {
    
    public static float divideArray(int[] a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }
        
        int s = SomaArray.somaArray(a, n);
        
        return s/2.0F;
    }
}
