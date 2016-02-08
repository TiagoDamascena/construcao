package br.ufg.inf.es.construcao.imprimearray;

/**
 * 
 */
public class ImprimeArray {
    
    public static void imprimeArray(int[] a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }
        
        int i = 0;
        
        while(i <= n-1) {
            System.out.print(a[i]);
            i++;
        }
    }
}
