package br.ufg.inf.es.construcao.divide;

import br.ufg.inf.es.construcao.divisao.Divisao;
import br.ufg.inf.es.construcao.mod.Mod;
import br.ufg.inf.es.construcao.produto.Produto;

/**
 * Divisão
 */
public class Divide {
    
    /**
     * Divide um número por outro
     * @param divisor Divisor
     * @param dividendo Dividendo
     * @param precisao Número de casas decimais a calcular
     */
    public static void divide(int divisor, int dividendo, int precisao) {
        if (divisor <= 0) {
            throw new IllegalArgumentException("Divisor inválido");
        }
        if (dividendo <= 0) {
            throw new IllegalArgumentException("Dividendo inválido");
        }
        
        int divisao = Divisao.divideSomas(divisor, dividendo);
        System.out.print(divisao);
        
        int resto = Mod.mod(divisor, dividendo);
        
        if(resto != 0) {
            System.out.print(",");
        }
        
        while(resto != 0 && precisao > 0) {
            resto = (int)Produto.produto(10, resto);
            divisao = Divisao.divideSomas(resto, dividendo);
            System.out.print(divisao);
            resto = Mod.mod(resto, dividendo);
            precisao--;
        }
    }
}
