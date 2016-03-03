package br.ufg.inf.es.construcao.mdc;

/**
 * Fun��o para calculo do m�ximo divisor comum.
 */
public class Mdc {

    /**
     * Calcula o m�ximo divisor comum entre a e b.
     *
     * @param a Primeiro numero.
     * @param b Segundo numero.
     * @return O m�ximo divisor comum entre eles.
     * @throws IllegalArgumentException Caso a ou b não estejam na faixa
     * admitida. a deve ser maior ou igual a b. b deve ser maior que 0.
     */
    public static int mdc(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("A inv�lido");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("B inv�lido");
        }

        while (b != 0) {
            int max = a % b;
            a = b;
            b = max;
        }

        return a;
    }

    /**
     * Calcula o m�ximo divisor comum entre a e b atrav�s de subtra��es.
     *
     * @param a Primeiro numero.
     * @param b Segundo numero.
     * @return O m�ximo divisor comum entre eles.
     * @throws IllegalArgumentException Caso a ou b n�o estejam na faixa
     * admitida. a deve ser maior ou igual a b. b deve ser maior que 0.
     */
    public static int mdc2(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("A inv�lido");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("B inv�lido");
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }
}
