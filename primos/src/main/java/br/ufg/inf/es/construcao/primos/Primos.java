package br.ufg.inf.es.construcao.primos;

/**
 * Serviços relacionados a números primos
 */
public class Primos {

    /**
     * Verifica se um número é primo ou não
     *
     * @param numero Número a ser verificado
     * @return Verdadeiro caso seja primo e falso caso não seja
     * @throws IllegalArgumentException Caso o numero não estejam na faixa
     * admitida O numero deve ser um valor maior ou igual a 2.
     */
    public static boolean primo(int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("Número inválido");
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
     * Coloca a lista dos n primeiros números primos em um vetor
     *
     * @param vetor Vetor que receberá a lista de números primos.
     * @throws IllegalArgumentException Caso o tamanho do vetor não esteja na
     * faixa admitida e o vetor não esteja povoado por 0. O tamanho do vetor
     * deve ser maior ou igual a n.
     */
    public static void crivoEratostenes(int[] vetor) {
        if (vetor.length < 2) {
            throw new IllegalArgumentException("Tamanho do vetor inválido");
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
