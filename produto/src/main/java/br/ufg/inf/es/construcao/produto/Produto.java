package br.ufg.inf.es.construcao.produto;

/**
 * Classe que implementa produto usando apenas somas.
 */
public class Produto {
    
    /**
     * Calcula o produto de dois números.
     * @param a O primeiro número a ser multiplicado.
     * @param b O segundo número a ser multiplicado.
     * @return Produto de a por b.
     * @throws IllegalArgumentException Se algum dos argumentos
     * for menor que zero.
     */
    public static int produto(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a ou b inválido");
        }

        int i = 1;
        int soma = 0;
        while (i <= b) {
            soma = soma + a;
            i = i + 1;
        }

        return soma;
    }
}
