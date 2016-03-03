package br.ufg.inf.es.construcao.polsimples;

import br.ufg.inf.es.construcao.potencia.Potencia;

/**
 * Calculo de um polinomio simples
 */
public class PolSimples {

    /**
     * Calcula o resultado de um polinômio
     *
     * @param x valor de x
     * @param elementos elementos do polinômio
     * @return resultado
     * @throws IllegalArgumentException caso o tamanho do vetor de elementos
     * seja menor que 1.
     */
    public static float polSimples(float x, float[] elementos) {
        if (elementos.length < 1) {
            throw new IllegalArgumentException("Tamanho inválido");
        }

        double t;

        float p = elementos[0];
        int i = 1;

        while (i < elementos.length) {
            t = Potencia.potencia(x, i);
            p += elementos[i] * t;
            i++;
        }

        return p;
    }
}
