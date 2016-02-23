package br.ufg.inf.es.construcao.somadivisores;

import br.ufg.inf.es.construcao.mod.Mod;

/**
 * Fornece uma fun��o para o calculo da soma de divisores
 */
public class SomaDivisores {
    
    /**
     * Calcula a soma dos divisores de um n�mero
     * @param numero n�ero do qual os divisores ser�o somados
     * @return soma dos divisores do n�mero
     * @throws IllegalArgumentException caso o n�mero seja menor ou igual a 0
     */
    public static int somaDivisores(int numero) {
        if(numero <= 0) {
            throw new IllegalArgumentException("N�mero invalido");
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
