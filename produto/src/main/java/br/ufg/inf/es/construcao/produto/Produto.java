package br.ufg.inf.es.construcao.produto;

/**
 * Classe que implementa produto usando apenas somas.
 */
public class Produto {

    /**
     * Calcula o produto de dois n�meros atrav�s de somas.
     *
     * @param a O primeiro n�mero a ser multiplicado.
     * @param b O segundo n�mero a ser multiplicado.
     * @return Produto de a por b.
     * @throws IllegalArgumentException Se algum dos argumentos for menor que
     * zero.
     */
    public static double produto(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Coeficiente inv�lido");
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
