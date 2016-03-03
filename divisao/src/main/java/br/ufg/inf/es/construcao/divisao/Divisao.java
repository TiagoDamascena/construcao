package br.ufg.inf.es.construcao.divisao;

/**
 * Fornece fun��es para divis�o de inteiros
 */
public class Divisao {

    /**
     * Realiza a divis�o de um n�mero por outro através de somas sucessivas
     *
     * @param divisor Divisor da divis�o.
     * @param dividendo Dividendo da divis�o.
     * @return resultado da divis�o.
     * @throws IllegalArgumentException caso um dos valores esteja fora da faixa
     * admitida. Divisor deve ser maior ou igual a 0 Dividendo deve ser maior
     * que 0
     */
    public static int divideSomas(int divisor, int dividendo) {
        if (divisor < 0) {
            throw new IllegalArgumentException("Divisor inv�lido");
        }

        if (dividendo <= 0) {
            throw new IllegalArgumentException("Dividendo inv�lido");
        }

        int divisao = 0;
        int soma = dividendo;

        while (soma <= divisor) {
            soma += dividendo;
            divisao++;
        }

        return divisao;
    }

    /**
     * Realiza a divis�o de um n�mero por outro através de subtra��es
     * sucessivas
     *
     * @param divisor Divisor da divis�o.
     * @param dividendo Dividendo da divis�o.
     * @return resultado da divis�o.
     * @throws IllegalArgumentException caso um dos valores esteja fora da faixa
     * admitida. Divisor deve ser maior ou igual a 0 Dividendo deve ser maior
     * que 0
     */
    public static int divideSubtracao(int divisor, int dividendo) {
        if (divisor < 0) {
            throw new IllegalArgumentException("divisor inv�lido");
        }

        if (dividendo <= 0) {
            throw new IllegalArgumentException("dividendo inv�lido");
        }

        int divisao = 0;
        int soma = divisor;

        while (soma >= dividendo) {
            soma -= dividendo;
            divisao++;
        }

        return divisao;
    }
}
