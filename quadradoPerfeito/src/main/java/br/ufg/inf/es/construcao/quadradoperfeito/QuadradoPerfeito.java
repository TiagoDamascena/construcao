package br.ufg.inf.es.construcao.quadradoperfeito;

/**
 * Fun��es relacionadas a um quadrado perfeito
 */
public class QuadradoPerfeito {

    /**
     * Verifica se um n�mero � um quadrado perfeito.
     *
     * @param numero n�mero a ser verificado.
     * @return verdadeiro caso o numero seja um quadrado perfeito e falso caso
     * contr�rio.
     * @throws IllegalArgumentException caso o n�mero seja menor que 1.
     */
    public static boolean quadradoPerfeito(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        int i = 1;
        int quadrado = 1;

        while (quadrado < numero) {
            i += 2;
            quadrado += i;
        }

        return (quadrado == numero);
    }
}
