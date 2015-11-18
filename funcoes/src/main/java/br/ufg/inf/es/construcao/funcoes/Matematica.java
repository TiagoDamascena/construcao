package br.ufg.inf.es.construcao.funcoes;

/**
 * Funções matemáticas.
 */
public class Matematica {

    /**
     * Produz a soma dos primeiros naturais.
     * @param numero A quantidade dos primeiros naturais
     *          a serem somados.
     * @return Soma dos primeiros naturais.
     * @throws IllegalArgumentException Se o argumento
     * for menor que um.
     */
    public static int somaNaturais(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("numero inválido");
        }

        int i = 2;
        int soma = 1;

        while (i <= numero) {
            soma = soma + i;
            i = i + 1;
        }

        return soma;
    }
}
