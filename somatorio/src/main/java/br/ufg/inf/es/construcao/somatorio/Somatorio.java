package br.ufg.inf.es.construcao.somatorio;

/**
 * Fun��o de somat�rio a partir de um n�mero
 */
public class Somatorio {
    
    /**
     * Faz um somat�rio a partir de um n�mero
     * @param numero numero a partir do qual ser� realizado esse somat�rio
     * @return resultado do somat�rio
     */
    public static double somatorio(int numero) {
        if(numero < 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
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
