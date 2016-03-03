package br.ufg.inf.es.construcao.imprimearray;

/**
 * Imprime um vetor
 */
public class ImprimeArray {

    /**
     * Imprime os n elementos de um vetor
     *
     * @param vetor vetor a ser impresso
     */
    public static void imprimeArray(int[] vetor) {
        if (vetor.length < 0) {
            throw new IllegalArgumentException("Tamanho inválido");
        }

        int i = 0;

        while (i < vetor.length) {
            System.out.print(vetor[i]);
            i++;
        }
    }
}
