package br.ufg.inf.es.construcao.divisao;

/**
 *
 */
public class Divisao {
    
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
}
