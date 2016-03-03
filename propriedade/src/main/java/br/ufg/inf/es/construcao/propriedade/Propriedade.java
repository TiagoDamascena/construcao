package br.ufg.inf.es.construcao.propriedade;

import br.ufg.inf.es.construcao.fatorial.Fatorial;

/**
 * Fun��o para verifica��o das propriedades de um n�mero.
 */
public class Propriedade {

    /**
     * Verifica se um n�mero atende a propriedade 153
     *
     * @param numero Numero a ser verificado.
     * @return Verdadeiro caso atenda, e falso caso n�o atenda.
     * @throws IllegalArgumentException Caso o numero n�o estejam na faixa
     * admitida. O numero deve ser um valor maior ou igual a 0 e menor ou igual
     * a 999.
     */
    public static boolean propriedade153(int numero) {
        if (numero < 0 || numero > 999) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        int i = numero / 100;
        int j = (numero - 100) / 10;
        int k = numero % 10;

        int n = (i * i * i) + (j * j * j) + (k * k * k);

        return n == numero;
    }

    /**
     * Verifica se um n�mero atende a propriedade 3025
     *
     * @param numero Numero a ser verificado.
     * @return Verdadeiro caso atenda, e falso caso n�o atenda.
     * @throws IllegalArgumentException Caso o numero n�o estejam na faixa
     * admitida. O numero deve ser um valor maior ou igual a 0 e menor ou igual
     * a 9999.
     */
    public static boolean propriedade3025(int numero) {
        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        int i = numero / 100;
        int j = numero % 100;

        int n = i + j;
        n = n * n;

        return n == numero;
    }

    /**
     * Calcula a quantidade de n�meros de 0 a 1000 que atendem a propriedade da
     * soma dos fatoriais
     *
     * @return n�mero de d�gitos que atendem a propriedade
     */
    public static int propriedadeSomaFatorial() {
        int total = 0;
        int num = 0;

        while (num < 1000) {
            if (Fatorial.atendeSomaFatorialDigitos(num)) {
                total++;
            }
            num++;
        }
        return total;
    }
}
