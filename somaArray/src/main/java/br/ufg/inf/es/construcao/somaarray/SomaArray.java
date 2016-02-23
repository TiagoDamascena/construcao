package br.ufg.inf.es.construcao.somaarray;

/**
 * Soma dos elementos de um vetor
 */
public class SomaArray {
   
    /**
     * Soma os n elementos de um vetor
     * @param vetor vetor a ser somado
     * @param numero numero de elementos a serem somado
     * @return soma dos n elementos
     */
    public static int somaArray(int[] vetor, int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        
        int soma = 0;
        int i = 0;
        
        while(i < numero) {
            soma += vetor[i];
            i++;
        }
        return soma;
    }
}
