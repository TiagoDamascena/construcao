package br.ufg.inf.es.construcao.harmonico;

/**
 *  Função para cálculo do harmônico de um número
 */
public class Harmonico {
    
    /**
     * Calcula o numero harmônico de um número
     * @param numero número do qual será calculado o harmônico
     * 
     * @return o harmônico do número
     * 
     * @throws IllegalArgumentException Caso o número seja menor que 1
     */
    public static double numeroHarmonico(int numero) {
        if(numero < 1) {
            throw new IllegalArgumentException("numero inválido");
        }
        
        int i = 2;
        double soma = 1;
        
        while(i <= numero) {
            soma += 1.0/i;
            i++;
        }
        
        return soma;
    }
}
