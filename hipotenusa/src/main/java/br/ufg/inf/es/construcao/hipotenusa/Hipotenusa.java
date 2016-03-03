package br.ufg.inf.es.construcao.hipotenusa;

import br.ufg.inf.es.construcao.raiz.Raiz;

/**
 * Funções para o calculo da hipotenusa
 */
public class Hipotenusa {

    /**
     * Calcula a hipotenusa de um triangulo
     *
     * @param a cateto a
     * @param b cateto b
     * @return hipotenusa
     */
    public static float hipotenusa(int a, int b) {
        int x = a * a;
        int y = b * b;

        float hipotenusa = Raiz.raizQuadrada(x + y, 20);

        return hipotenusa;
    }
}
