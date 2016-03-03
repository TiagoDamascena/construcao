package br.ufg.inf.es.construcao.polhorner;

/**
 * Cálculo do polinômio de Horner
 */
public class PolHorner {

    /**
     * Calcula o resultado de um polinômio de Horner
     *
     * @param x valor de x
     * @param elementos elementos do polinômio
     * @return resultado
     * @throws IllegalArgumentException caso o tamanho do vetor de elementos
     * seja menor que 1.
     */
    public static float polHorner(float x, float[] elementos) {
        if (elementos.length < 1) {
            throw new IllegalArgumentException("Tamanho inválido");
        }

        float polinomio = elementos[elementos.length - 1];
        int i = elementos.length - 2;

        while (i >= 0) {
            polinomio = polinomio * x + elementos[i];
            i--;
        }

        return polinomio;
    }
}
