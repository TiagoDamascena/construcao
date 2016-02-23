package br.ufg.inf.es.construcao.mediaarray;

import br.ufg.inf.es.construcao.somaarray.SomaArray;

/**
 * Calculo da média de um vetor
 */
public class MediaArray {
    
    /**
     * Calcula a média da soma dos valores de um vetor
     * @param vetor vetor para o calculo
     * @param numero numero de elementos a serem usados
     * @return 
     */
    public static int mediaArray(int[] vetor, int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Numero Inválido");
        }
        
        int soma = SomaArray.somaArray(vetor, numero);
        
        return soma/numero;
    }
}
