package br.ufg.inf.es.construcao.fibonacci;

/**
 * Fun��o para obter um n�mero da sequ�ncia de Fibonacci
 */
public class Fibonacci {

    /**
     * Calcula um determinado n�mero na sequ�ncia de fibonacci.
     *
     * @param numero qual n�mero da sequ�ncia.
     * @return o n�mero de fibonacci na posi��o solicitada dentro da sequ�ncia.
     * @throws IllegalArgumentException caso o numero informado seja menor que
     * 0.
     */
    public static int fibonacci(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        int anterior = 0;
        int corrente = 1;

        if (numero == 0 || numero == 1) {
            return numero;
        }

        int i = 2;

        while (i <= numero) {
            int temporario = corrente;
            corrente += anterior;
            anterior = temporario;
            i++;
        }

        return corrente;
    }
}
