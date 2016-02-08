package br.ufg.inf.es.construcao.bublesort;

/**
 * 
 */
public class BubleSort {
    
    public static void bubleSort(int[] a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }
        
        int p = n;
        
        while(p >= 1) {
            int i = 0;
            while(i < p) {
                if(a[i] > a[i+1]) {
                    int t = a[i];
                    a[i] = a[i+1];
                    a[i+1] = t;
                }
                i++;
            }
            p--;
        }
    }
}
