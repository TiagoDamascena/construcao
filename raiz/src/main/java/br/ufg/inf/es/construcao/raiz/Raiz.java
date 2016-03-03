package br.ufg.inf.es.construcao.raiz;

/**
 * Fornece fun��es para o calculo da raiz quadrada
 */
public class Raiz {

    /**
     * Calcula a raiz de um determinado numero
     *
     * @param numero numero a ser calculado
     * @param precisao precisao do calculo
     * @return resultado da raiz quadrada
     * @throws IllegalArgumentException caso o n�mero seja menor ou igual a
     * zero.
     */
    public static float raizQuadrada(int numero, int precisao) {

        if (numero <= 0) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        float resultado = 1;

        while (precisao >= 0) {
            resultado = (resultado + numero / resultado) / 2.0F;
            precisao--;
        }
        return resultado;
    }
}
