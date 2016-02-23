package br.ufg.inf.es.construcao.somadivisores;

import br.ufg.inf.es.construcao.mod.Mod;

/**
 * Fornece uma função para o calculo da soma de divisores
 */
public class SomaDivisores {
    
    /**
     * Calcula a soma dos divisores de um número
     * @param numero núero do qual os divisores serão somados
     * @return soma dos divisores do número
     * @throws IllegalArgumentException caso o número seja menor ou igual a 0
     */
    public static int somaDivisores(int numero) {
        if(numero <= 0) {
            throw new IllegalArgumentException("Número invalido");
        }
        
        int divisor = 2;
        int soma = 1;
        
        while(divisor <= numero/2) {
            if(Mod.mod(numero, divisor) == 0) {
                soma += divisor;
            }
            divisor++;
        }
        return soma;
    }
}
