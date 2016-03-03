package br.ufg.inf.es.construcao.mediaarray;

import br.ufg.inf.es.construcao.somaarray.SomaArray;

/**
 * Calculo da média de um vetor
 */
public class MediaArray {

    /**
     * Calcula a média da soma dos valores de um vetor
     *
     * @param vetor vetor para o calculo
     * @return a média dos valores do vetor
     */
    public static int mediaArray(int[] vetor) {
        if (vetor.length < 0) {
            throw new IllegalArgumentException("Tamanho Inválido");
        }

        int soma = SomaArray.somaArray(vetor);

        return soma / vetor.length;
    }
}
