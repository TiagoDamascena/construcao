package br.ufg.inf.es.construcao.produto;

/**
 * Classe que implementa produto usando apenas somas.
 */
public class Produto {

    /**
     * Calcula o produto de dois números através de somas.
     *
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return Produto de a por b.
     * @throws IllegalArgumentException Se algum dos argumentos for menor que
     * zero.
     */
    public static double produto(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Coeficiente inválido");
        }

        int i = 1;
        double soma = 0;
        while (i <= b) {
            soma += a;
            i++;
        }

        return soma;
    }
}
