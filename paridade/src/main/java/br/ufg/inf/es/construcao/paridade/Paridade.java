package br.ufg.inf.es.construcao.paridade;

/**
 * Implementa��o de verifica��o de paridade.
 */
public class Paridade {

    /**
     * Verifica paridade de um n�mero.
     * @param numero N�mero cuja paridade � verificada.
     * @return {@code true} se o n�mero fornecido �
     * par e {@code false}, caso contrário.
     */
    public static boolean verifica(int numero) {
        return numero % 2 == 0;
    }
}
