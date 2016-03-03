package br.ufg.inf.es.construcao.somaarray;

/**
 * Soma dos elementos de um vetor
 */
public class SomaArray {

    /**
     * Soma os n elementos de um vetor
     *
     * @param vetor vetor a ser somado
     * @return soma dos n elementos
     */
    public static int somaArray(int[] vetor) {
        if (vetor.length < 0) {
            throw new IllegalArgumentException("Tamanho inválido");
        }

        int soma = 0;
        int i = 0;

        while (i < vetor.length) {
            soma += vetor[i];
            i++;
        }
        return soma;
    }
}
