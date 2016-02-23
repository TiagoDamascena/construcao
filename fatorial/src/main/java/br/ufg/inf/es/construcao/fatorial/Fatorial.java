package br.ufg.inf.es.construcao.fatorial;

import br.ufg.inf.es.construcao.produto.Produto;

/**
 * Funções para cálculo do fatorial
 */
public class Fatorial {
    
    /**
     * Calcula o fatorial de um número
     * @param numero número para calcular o fatorial.
     * @return fatorial.
     * @throws IllegalArgumentException caso o numero seja menor que 1.
     */
    public static int fatorial(int numero) {
        if(numero < 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        if(numero == 0) {
            return 1;
        }
        
        int i = 2;
        int fatorial = 1;
        
        while(i <= numero) {
            fatorial *= i;
            i++;
        }
        return fatorial;
    }
    
    /**
     * Calcula o fatorial de um número através de somas
     * @param numero número para calcular o fatorial.
     * @return fatorial.
     * @throws IllegalArgumentException caso o numero seja menor que 1.
     */
    public static int fatorialSoma(int numero) {
        if(numero < 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        if(numero == 0) {
            return 1;
        }
        
        int i = 2;
        int fatorial = 1;
        
        while(i <= numero) {
            fatorial = (int)Produto.produto(fatorial, i);
            i++;
        }
        return fatorial;
    }
    
    /**
     * Verifica se a soma dos fatoriais dos dígitos é igual ao número
     * @param numero número para ser verificado
     * @return true caso cumpra e false caso contrario
     */
    public static boolean atendeSomaFatorialDigitos(int numero) {
        if(numero < 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        
        int a = numero / 100;
        int b = (numero - 100 * a) / 10;
        int c = numero % 10;
        int s = fatorial(a) + fatorial(b) + fatorial(c);
        
        return s == numero;
    }
}
