package br.ufg.inf.es.construcao.logaritmo;

import br.ufg.inf.es.construcao.potencia.Potencia;
import br.ufg.inf.es.construcao.fatorial.Fatorial;

/**
 * Fornece funções relacionadas a Logaritmos
 */
public class Logaritmo {
    
    /**
     * Calcula o log de um numero em uma determinada base
     * @param numero numero do calculo
     * @param base base do calculo
     * @return resultado do log
     * @throws IllegalArgumentException quando numero for 
     * menor que 1 e a base for menor que 2.
     */
    public static int logNaturalSimples(int numero, int base) {
        if(numero < 1) {
            throw new IllegalArgumentException("Número inválido");
        }
        
        if(base < 2) {
            throw new IllegalArgumentException("Base inválida");
        }
        
        int i = 2;
        int expoente = numero+1;
        
        while(i <= base) {
            int potencia = (int)Potencia.potencia(numero, i);
            int fatorial = Fatorial.fatorial(i);
            expoente += potencia/fatorial;
            i++;
        }
        return expoente;
    }
    
    /**
     * Calcula o log de um numero em uma determinada base
     * @param numero numero do calculo
     * @param base base do calculo
     * @return resultado do log
     * @throws IllegalArgumentException quando numero for 
     * menor que 1 e a base for menor que 2.
     */
    public static int logN(int numero, int base) {
        if(numero < 1) {
            throw new IllegalArgumentException("Número inválido");
        }
        
        if(base < 2) {
            throw new IllegalArgumentException("Base inválida");
        }
        
        int i = 2;
        int expoente = numero+1;
        int t = numero;
        
        while(i <= base) {
            t *= numero/i;
            expoente += t;
            i++;
        }
        return expoente;
    }
}
