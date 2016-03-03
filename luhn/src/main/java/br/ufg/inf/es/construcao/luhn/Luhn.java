package br.ufg.inf.es.construcao.luhn;

import br.ufg.inf.es.construcao.mod.Mod;

/**
 * Algoritmo de Luhn
 */
public class Luhn {

    /**
     * Cálculo do algoritmo de luhn para um determinado vetor
     *
     * @param numeros vetor de numeros
     * @return resultado do algoritmo
     */
    public static int luhn(int[] numeros) {
        if (numeros.length < 2) {
            throw new IllegalArgumentException("Tamanho do vetor inválido");
        }

        int impares = 0;
        int pares = 0;

        int l = numeros.length - 2;
        boolean a = false;

        while (l >= 0) {
            if (a) {
                pares += numeros[l];
            } else {
                int termo = numeros[l] * 2;
                impares += (termo / 10) + Mod.mod(termo, 10);
            }

            l--;

            a = !a;
        }

        return 10 - Mod.mod(impares + pares, 10);
    }
}
