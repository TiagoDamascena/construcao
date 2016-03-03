package br.ufg.inf.es.construcao.logaritmo;

import br.ufg.inf.es.construcao.potencia.Potencia;
import br.ufg.inf.es.construcao.fatorial.Fatorial;

/**
 * Fornece fun��es relacionadas a Logaritmos
 */
public class Logaritmo {

    /**
     * Calcula o log de um numero em uma determinada base
     *
     * @param numero numero do calculo
     * @param base base do calculo
     * @return resultado do log
     * @throws IllegalArgumentException quando numero for menor que 1 e a base
     * for menor que 2.
     */
    public static float logNaturalSimples(int numero, int base) {
        if (numero < 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        if (base < 2) {
            throw new IllegalArgumentException("Base inv�lida");
        }

        int i = 2;
        float expoente = numero + 1;

        while (i <= base) {
            float potencia = (float)Potencia.potencia(numero, i);
            float fatorial = Fatorial.fatorial(i);
            expoente += potencia / fatorial;
            i++;
        }
        return expoente;
    }

    /**
     * Calcula o log de um numero em uma determinada base
     *
     * @param numero numero do calculo
     * @param base base do calculo
     * @return resultado do log
     * @throws IllegalArgumentException quando numero for menor que 1 e a base
     * for menor que 2.
     */
    public static float logN(int numero, int base) {
        if (numero < 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        if (base < 2) {
            throw new IllegalArgumentException("Base inv�lida");
        }

        float i = 2;
        float expoente = numero + 1;
        float t = numero;

        while (i <= base) {
            t = (t * numero) / i;
            expoente += t;
            i++;
        }
        return expoente;
    }
}
