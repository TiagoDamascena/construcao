package br.ufg.inf.es.construcao.luhn;

import br.ufg.inf.es.construcao.mod.Mod;

/**
 * Funções relacionadas ao algoritmo de Luhn
 */
public class Luhn {
    
    /**
     * Calcula o digito verificador a partir de uma sequência de digitos
     *
     * @param numeros digitos a partir dos quais será gerado o digito verificador
     * @return digito verificador desse numero
     * @throws IllegalArgumentException caso a quantidade de digitos do numero seja menor que 2
     */
    public static int luhn(int[] numeros) {
        if (numeros.length < 2) {
            throw new IllegalArgumentException("tamanho do vetor inválido");
        }
        
        int impares = 0;
        int pares = 0;
        
        int i = numeros.length-2;
        boolean a = false;
        
        while(i >= 0) {
            if(a) {
                pares += numeros[i];
            } else {
                int termo = numeros[i] * 2;
                impares += (termo / 10) + Mod.mod(termo, 10);
            }
            
            i--;
            
            a = !a;
        }
        
        return 10-Mod.mod(impares + pares, 10);
    }
}
