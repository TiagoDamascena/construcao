package br.ufg.inf.es.construcao.logaritmo;

public class Logaritmo {

    public static double logn(int n, int k) {
        if (n < 1) {
            throw new IllegalArgumentException("n");
        }

        if (k < 2) {
            throw new IllegalArgumentException("k");
        }

        int i = 2;
        double e = n + 1;

        while (i <= k) {
            double p = potencia(n, i);
            long f = fatorial(i);
            e = e + p / f;
            i = i + 1;
        }

        return e;
    }

    public static double potencia(int base, int expoente) {
        return Math.pow(base, expoente);
    }

    public static long fatorial(int i) {
        if (i == 1) {
            return 1;
        }

        return i * fatorial(i - 1);
    }
}
