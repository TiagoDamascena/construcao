package br.ufg.inf.es.construcao.harmonico;

/**
 * Fun��o para c�lculo do harm�nico de um n�mero
 */
public class Harmonico {

    /**
     * Calcula o numero harm�nico de um n�mero
     *
     * @param numero n�mero do qual ser� calculado o harm�nico
     * @return o harm�nico do n�mero
     * @throws IllegalArgumentException Caso o n�mero seja menor que 1
     */
    public static double numeroHarmonico(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        int i = 2;
        double soma = 1;

        while (i <= numero) {
            soma += 1.0 / i;
            i++;
        }

        return soma;
    }
}
