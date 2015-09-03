package br.ufg.inf.es.construcao.funcoes;

/**
 * Funções matemáticas.
 */
public class Matematica {

    /**
     * Produz a soma dos primeiros naturais.
     * @param n A quantidade os primeiros naturais
     *          a serem somados.
     * @return Soma dos primeiros naturais.
     * @throws IllegalArgumentException Se o argumento
     * for menor que um.
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }
}
