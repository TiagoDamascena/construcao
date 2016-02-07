package br.ufg.inf.es.construcao.cpf;

import br.ufg.inf.es.construcao.mod.Mod;

/**
 * 
 */
public class Cpf {
    
    public static boolean cpf(int[] d) {
        if (d.length != 12) {
            throw new IllegalArgumentException("tamanho inválido");
        }
        
        if (d[0] != 0) {
            throw new IllegalArgumentException("primeiro digito inválido");
        }
        
        int sj = d[1] + (2 * d[2]) + (3 * d[3]) + (4 * d[4]) + (5 * d[5]) + (6 * d[6]) + (7 * d[7]) + (8 * d[8]) + (9 * d[9]);
        int sk = d[2] + (2 * d[3]) + (3 * d[4]) + (4 * d[5]) + (5 * d[6]) + (6 * d[7]) + (7 * d[8]) + (8 * d[9]) + (9 * d[10]);
        
        int j = Mod.mod(Mod.mod(sj, 11), 10);
        int k = Mod.mod(Mod.mod(sk, 11), 10);
        
        return j == d[10] && k == d[11];
    }
    
    public static boolean cpf2(int[] d) {
        if (d.length != 12) {
            throw new IllegalArgumentException("tamanho inválido");
        }
        
        if (d[0] != 0) {
            throw new IllegalArgumentException("primeiro digito inválido");
        }
        
        int c = 8;
        
        int p = d[9];
        int s = d[9];
        
        while(c >= 1) {
            p += d[c];
            s += p;
            c--;
        }
        
        int j = Mod.mod(Mod.mod(s, 11), 10);
        int k = Mod.mod(Mod.mod(s - p + (9 * j), 11), 10);
        
        return j == d[10] && k == d[11];
    }
}
