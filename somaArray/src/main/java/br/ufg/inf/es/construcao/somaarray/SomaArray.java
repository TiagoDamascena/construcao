package br.ufg.inf.es.construcao.somaarray;

/**
 * 
 */
public class SomaArray {
   
    public static int somaArray(int[] a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }
        
        int s = 0;
        int i = 0;
        
        while(i <= n) {
            s += a[i];
            i++;
        }
        return s;
    }
}
