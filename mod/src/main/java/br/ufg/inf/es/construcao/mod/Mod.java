package br.ufg.inf.es.construcao.mod;

/**
 * Fornece funções de cálculo de mod(resto da divisão inteira)
 */
public class Mod {
    
    /**
     * Calcula o mod(resto) de uma divisão
     * @param divisor Divisor da divisão
     * @param dividendo Dividendo da divisão
     * @return O resto da divisão
     * @throws IllegalArgumentException caso algum argumeto esteja fora
     * da faixa admitida.
     * Divisor deve ser maior que 0.
     * Dividendo deve ser maior ou igual a 0;
     */
    public static int mod(int divisor, int dividendo) {
        if(divisor <= 0) {
            throw new IllegalArgumentException("Divisor inválido");
        }
        
        if(dividendo < 0) {
            throw new IllegalArgumentException("Dividendo inválido");
        }
        
        int soma = divisor;
        
        while(soma >= dividendo) {
            soma -= dividendo;
        }
        
        return soma;
    }
}
