package br.ufg.inf.es.construcao.somatorio;

/**
 * Função de somatório a partir de um número
 */
public class Somatorio {
    
    /**
     * Faz um somatório a partir de um número
     * @param numero numero a partir do qual será realizado esse somatório
     * @return resultado do somatório
     */
    public static double somatorio(int numero) {
        if(numero < 1) {
            throw new IllegalArgumentException("numero inválido");
        }
        
        int i = 1;
        double soma = 0;
        
        while(i <= numero) {
            int d = 1 + i*i;
            soma += 1.0/d;
            i++;
        }
        
        return soma;
    }
}
