package br.ufg.inf.es.construcao.razaoaurea;

/**
 * Calcular a Raz�o Aurea
 */
public class RazaoAurea {
    
    /**
     * Calcula a raz�o Aurea a partir de dois termos e um fator
     *
     * @param termo1 termo 1 da raz�o
     * @param termo2 termo 2 da raz�o
     * @param fator fator da raz�o
     * @return Raz�o Aurea
     * @throws IllegalArgumentException caso o termo1, termo2 ou fator n�o 
     * estejam na faixa admitida.
     * termo1 deve ser maior que 0
     * termo2 deve ser maior que o termo1
     * raz�o deve ser maior que 0
     */
    public static double razaoAurea(double termo1, double termo2, int fator) {
        if(termo1 <= 0) {
            throw new IllegalArgumentException("Termo1 inv�lido");
        }
        if(termo2 <= termo1) {
            throw new IllegalArgumentException("Termo2 inv�lido");
        }
        if(fator <= 0) {
            throw new IllegalArgumentException("Fator inv�lido");
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
