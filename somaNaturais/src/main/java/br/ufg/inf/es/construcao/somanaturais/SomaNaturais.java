package br.ufg.inf.es.construcao.somanaturais;

/**
 * 
 */
public class SomaNaturais {
    
    public static int somaNatrais(int n) {
        if(n == 1) {
            return 1;
        } else {
            return somaNatrais(n-1) + n;
        }
    }
}
