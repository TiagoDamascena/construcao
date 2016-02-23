package br.ufg.inf.es.construcao.mod;

/**
 * Fornece fun��es de c�lculo de mod(resto da divis�o inteira)
 */
public class Mod {
    
    /**
     * Calcula o mod(resto) de uma divis�o
     * @param divisor Divisor da divis�o
     * @param dividendo Dividendo da divis�o
     * @return O resto da divis�o
     * @throws IllegalArgumentException caso algum argumeto esteja fora
     * da faixa admitida.
     * Divisor deve ser maior que 0.
     * Dividendo deve ser maior ou igual a 0;
     */
    public static int mod(int divisor, int dividendo) {
        if(divisor <= 0) {
            throw new IllegalArgumentException("Divisor inv�lido");
        }
        
        if(dividendo < 0) {
            throw new IllegalArgumentException("Dividendo inv�lido");
        }
        
        int soma = divisor;
        
        while(soma >= dividendo) {
            soma -= dividendo;
        }
        
        return soma;
    }
}
