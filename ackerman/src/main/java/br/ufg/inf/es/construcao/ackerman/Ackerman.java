package br.ufg.inf.es.construcao.ackerman;

/**
 * Implementação da função de ackerman
 */
public class Ackerman {
    
    /**
     * Calcula a função de Ackerman para dois números determinados
     * @param x primeiro número
     * @param y segundo número
     * @return resultado da função
     */
    public static int ackerman(int x, int y) {
        if(x < 0) {
            throw new IllegalArgumentException("X inválido");
        }
        if(y < 0) {
            throw new IllegalArgumentException("Y inválido");
        }
        
        if(x == 0) {
            return y + 1;
        }
        
        if(y == 0) {
            return ackerman(x-1, 1);
        }
        
        return ackerman(x-1, ackerman(x, y-1));
    }
}
