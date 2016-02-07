package br.ufg.inf.es.construcao.divide;

import br.ufg.inf.es.construcao.divisao.Divisao;
import br.ufg.inf.es.construcao.mod.Mod;
import br.ufg.inf.es.construcao.produto.Produto;

/**
 * 
 */
public class Divide {
    
    /**
     * 
     * @param a
     * @param b
     * @param k 
     */
    public static void divide(int a, int b, int k) {
        if (a <= 0) {
            throw new IllegalArgumentException("a inválido");
        }
        if (b <= 0) {
            throw new IllegalArgumentException("b inválido");
        }
        
        int d = Divisao.divideSomas(a, b);
        System.out.print(d);
        
        int r = Mod.mod(a, b);
        
        if(r != 0) {
            System.out.print(",");
        }
        
        while(r != 0 && k > 0) {
            r = (int)Produto.produto(10, r);
            d = Divisao.divideSomas(r, b);
            System.out.print(d);
            r = Mod.mod(r, b);
            k--;
        }
    }
}
