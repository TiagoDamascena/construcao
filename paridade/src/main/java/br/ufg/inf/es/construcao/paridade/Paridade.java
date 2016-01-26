package br.ufg.inf.es.construcao.paridade;

/**
 * Implementação de verificação de paridade.
 */
public class Paridade {

    /**
     * Verifica paridade de um número.
     *
     * @param numero Número cuja paridade é verificada.
     *
     * @return {@code true} se o número fornecido é
     * par e {@code false}, caso contrário.
     */
    public static boolean verifica(int numero) {
        return numero % 2 == 0;
    }
}
