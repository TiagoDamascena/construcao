package br.ufg.inf.es.construcao.funcoes;

/**
 * Fun��es matem�ticas.
 */
public class Matematica {

    /**
     * Produz a soma dos primeiros naturais.
     * @param numero A quantidade dos primeiros naturais
     * a serem somados.
     * @return Soma dos primeiros naturais.
     * @throws IllegalArgumentException Se o argumento
     * for menor que um.
     */
    public static int somaNaturais(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        int i = 2;
        int soma = 1;

        while (i <= numero) {
            soma += i;
            i++;
        }

        return soma;
    }
}
