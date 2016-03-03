package br.ufg.inf.es.construcao.bublesort;

/**
 * Implementa o algoritmo de ordenação Buble Sort
 */
public class BubleSort {

    /**
     * Ordena um vetor de inteiros utilizando o algoritmo buble sort
     *
     * @param vetor vetor a ser ordenado
     */
    public static void bubleSort(int[] vetor) {
        if (vetor.length < 0) {
            throw new IllegalArgumentException("Tamanho inválido");
        }

        int posicao = vetor.length - 1;

        while (posicao >= 1) {
            int i = 0;
            while (i < posicao) {
                if (vetor[i] > vetor[i + 1]) {
                    int t = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = t;
                }
                i++;
            }
            posicao--;
        }
    }
}
