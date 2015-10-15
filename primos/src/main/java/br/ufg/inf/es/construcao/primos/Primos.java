package br.ufg.inf.es.construcao.primos;

public class Primos {

    public static void crivoEratostenes(int[] a, int n)
    {
        if (n < 2) {
            throw new IllegalArgumentException("n");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("tamanho vetor");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException();
            }
        }

        int i = 2;
        int c = 0;
        while (i <= n / 2) {
            if (a[i] == 0) {
                c = i + i;
                while (c <= n) {
                    a[c] = 1;
                    c += i;
                }
            }

            i += 1;
        }
    }
}
