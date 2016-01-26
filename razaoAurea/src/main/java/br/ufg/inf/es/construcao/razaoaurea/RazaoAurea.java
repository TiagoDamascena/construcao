package br.ufg.inf.es.construcao.razaoaurea;

/**
 * Calcular a Razão Aurea
 */
public class RazaoAurea {
    
    /**
     * Calcula a razão Aurea a partir de dois termos e um fator
     *
     * @param termo1 termo 1 da razão
     * @param termo2 termo 2 da razão
     * @param fator fator da razão
     *
     * @return Razão Aurea
     *
     * @throws IllegalArgumentException caso o termo1, termo2 ou fator não 
     *
     * estejam na faixa admitida.
     * termo1 deve ser maior que 0
     * termo2 deve ser maior que o termo1
     * razão deve ser maior que 0
     */
    public static double razaoAurea(double termo1, double termo2, int fator) {
        if(termo1 <= 0) {
            throw new IllegalArgumentException("termo1 inválido");
        }
        
        if(termo2 <= termo1) {
            throw new IllegalArgumentException("termo2 inválido");
        }
        
        if(fator <= 0) {
            throw new IllegalArgumentException("fator inválido");
        }
        
        double termoCorrente = termo2;
        double termoAnterior = termo1;
        int i = 1;
        
        while(i <= fator) {
            termoCorrente += termoAnterior;
            termoAnterior = termoCorrente - termoAnterior;
            i++;
        }
        
        return termoCorrente/termoAnterior;
    }
}
