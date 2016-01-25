package br.ufg.inf.es.construcao.divisao;

/**
 * Fornece funções para divisão de inteiros
 */
public class Divisao {
    
    /**
     * Realiza a divisão de um número por outro através de somas sucessivas
     * @param divisor Divisor da divisão.
     * @param dividendo Dividendo da divisão.
     * @return resultado da divisão.
     * @throws IllegalArgumentException caso um dos valores esteja fora da faixa admitida.
     * Divisor deve ser maior ou igual a 0
     * Dividendo deve ser maior que 0
     */
    public static int divideSomas(int divisor, int dividendo) {
        if(divisor < 0) {
            throw new IllegalArgumentException("divisor inválido");
        }
                
        if(dividendo <= 0) {
            throw new IllegalArgumentException("dividendo inválido");
        }
        
        int divisao = 0;
        int soma = dividendo;
        
        while(soma <= divisor) {
            soma += dividendo;
            divisao++;
        }
        
        return divisao;
    }
    
    /**
     * Realiza a divisão de um número por outro através de subtrações sucessivas
     * @param divisor Divisor da divisão.
     * @param dividendo Dividendo da divisão.
     * @return resultado da divisão.
     * @throws IllegalArgumentException caso um dos valores esteja fora da faixa admitida.
     * Divisor deve ser maior ou igual a 0
     * Dividendo deve ser maior que 0
     */
    public static int divideSubtracao(int divisor, int dividendo) {
        if(divisor < 0) {
            throw new IllegalArgumentException("divisor inválido");
        }
                
        if(dividendo <= 0) {
            throw new IllegalArgumentException("dividendo inválido");
        }
        
        int divisao = 0;
        int soma = divisor;
        
        while(soma >= dividendo) {
            soma -= dividendo;
            divisao++;
        }
        
        return divisao;
    } 
}
