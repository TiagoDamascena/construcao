package br.ufg.inf.es.construcao.mdc;

/**
 * Função para calculo do máximo divisor comum.
 */
public class Mdc {

    /**
     * Calcula o máximo divisor comum entre a e b.
     *
     * @param a Primeiro numero.
     * @param b Segundo numero.
     * @return O máximo divisor comum entre eles.
     * @throws IllegalArgumentException Caso a ou b nÃ£o estejam na faixa
     * admitida. a deve ser maior ou igual a b. b deve ser maior que 0.
     */
    public static int mdc(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("A inválido");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("B inválido");
        }

        while (b != 0) {
            int max = a % b;
            a = b;
            b = max;
        }

        return a;
    }

    /**
     * Calcula o máximo divisor comum entre a e b através de subtrações.
     *
     * @param a Primeiro numero.
     * @param b Segundo numero.
     * @return O máximo divisor comum entre eles.
     * @throws IllegalArgumentException Caso a ou b não estejam na faixa
     * admitida. a deve ser maior ou igual a b. b deve ser maior que 0.
     */
    public static int mdc2(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("A inválido");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("B inválido");
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
