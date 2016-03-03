package br.ufg.inf.es.construcao.primos;

/**
 * Servi�os relacionados a n�meros primos
 */
public class Primos {

    /**
     * Verifica se um n�mero � primo ou n�o
     *
     * @param numero N�mero a ser verificado
     * @return Verdadeiro caso seja primo e falso caso n�o seja
     * @throws IllegalArgumentException Caso o numero n�o estejam na faixa
     * admitida O numero deve ser um valor maior ou igual a 2.
     */
    public static boolean primo(int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        int i = 2;

        while (i < numero) {
            if (numero % i == 0) {
                return false;
            }

            i = i + 1;
        }

        return true;
    }

    /**
     * Coloca a lista dos n primeiros n�meros primos em um vetor
     *
     * @param vetor Vetor que receber� a lista de n�meros primos.
     * @throws IllegalArgumentException Caso o tamanho do vetor n�o esteja na
     * faixa admitida e o vetor n�o esteja povoado por 0. O tamanho do vetor
     * deve ser maior ou igual a n.
     */
    public static void crivoEratostenes(int[] vetor) {
        if (vetor.length < 2) {
            throw new IllegalArgumentException("Tamanho do vetor inv�lido");
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                throw new IllegalArgumentException("Valor incorreto dentro do vetor");
            }
        }

        int i = 2;
        int c;

        while (i <= vetor.length / 2) {
            if (vetor[i] == 0) {
                c = i + i;

                while (c < vetor.length) {
                    vetor[c] = 1;
                    c = c + i;
                }
            }

            i++;
        }
    }
}
