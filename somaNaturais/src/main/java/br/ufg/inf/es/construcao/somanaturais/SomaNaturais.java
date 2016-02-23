package br.ufg.inf.es.construcao.somanaturais;

/**
 * Soma de numero naturais
 */
public class SomaNaturais {
    
    /**
     * Soma os n primeiros numeros naturais
     * @param numero numero de naturais a serem somados
     * @return soma dos n primeiros naturais
     */
    public static int somaNatrais(int numero) {
        if(numero == 1) {
            return 1;
        } else {
            return somaNatrais(numero-1) + numero;
        }
    }
}
