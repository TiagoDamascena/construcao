package br.ufg.inf.es.construcao.fatorial;

/**
 * Funções para cálculo do fatorial
 */
public class Fatorial {
    
    /**
     * Calcula o fatorial de um número
     *
     * @param numero número para calcular o fatorial.
     *
     * @return fatorial.
     *
     * @throws IllegalArgumentException caso o numero seja menor que 1.
     */
    public static int fatorial(int numero) {
        if(numero < 1) {
            throw new IllegalArgumentException("numero inválido");
        }
        
        int i = 2;
        int fatorial = 1;
        
        while(i <= numero) {
            fatorial *= i;
            i++;
        }
        return fatorial;
    }
}
