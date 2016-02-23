package br.ufg.inf.es.construcao.imprimearray;

/**
 * Imprime um vetor
 */
public class ImprimeArray {
    
    /**
     * Imprime os n elementos de um vetor
     * @param vetor vetor a ser impresso
     * @param numero numero de elementos a serem impressos
     */
    public static void imprimeArray(int[] vetor, int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        
        int i = 0;
        
        while(i <= numero-1) {
            System.out.print(vetor[i]);
            i++;
        }
    }
}
