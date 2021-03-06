package br.ufg.inf.es.construcao.pi;

/**
 * Calculas o valor de Pi
 */
public class Pi {

    /**
     * Algoritmo para obten��o do valor de Pi a partir do somat�rio de n termos.
     *
     * @param numero n�mero de termos do somat�rio de Pi, quanto maior mais
     * preciso o resultado.
     * @return O valor calculado de Pi.
     * @throws IllegalArgumentException quando o n�mero � menor que 1.
     */
    public static double pi(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        int i = 1;
        double sinal = -1;
        double idendo = -1;
        double pi = 0;

        while (i <= numero) {
            idendo += 2;
            sinal = -1 * sinal;
            pi += 4 * sinal / idendo;
            i++;
        }
        return pi;
    }
}
