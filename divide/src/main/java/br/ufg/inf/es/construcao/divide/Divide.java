package br.ufg.inf.es.construcao.divide;

import br.ufg.inf.es.construcao.divisao.Divisao;
import br.ufg.inf.es.construcao.mod.Mod;
import br.ufg.inf.es.construcao.produto.Produto;

/**
 * Divis�o
 */
public class Divide {
    
    /**
     * Divide um n�mero por outro
     * @param divisor Divisor
     * @param dividendo Dividendo
     * @param precisao N�mero de casas decimais a calcular
     */
    public static void divide(int divisor, int dividendo, int precisao) {
        if (divisor <= 0) {
            throw new IllegalArgumentException("Divisor inv�lido");
        }
        if (dividendo <= 0) {
            throw new IllegalArgumentException("Dividendo inv�lido");
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
