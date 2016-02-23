package br.ufg.inf.es.construcao.cpf;

import br.ufg.inf.es.construcao.mod.Mod;

/**
 * Validação de CPF
 */
public class Cpf {
    
    /**
     * Verifica se um dado CPF é válido
     * @param cpf CPF a ser validado
     * @return true caso o CPF seja válido e false caso contrário
     */
    public static boolean cpf(int[] cpf) {
        if (cpf.length != 12) {
            throw new IllegalArgumentException("tamanho inválido");
        }
        
        if (cpf[0] != 0) {
            throw new IllegalArgumentException("primeiro digito inválido");
        }
        
        int sj = cpf[1] + (2 * cpf[2]) + (3 * cpf[3]) + (4 * cpf[4]) + (5 * cpf[5]) + (6 * cpf[6]) + (7 * cpf[7]) + (8 * cpf[8]) + (9 * cpf[9]);
        int sk = cpf[2] + (2 * cpf[3]) + (3 * cpf[4]) + (4 * cpf[5]) + (5 * cpf[6]) + (6 * cpf[7]) + (7 * cpf[8]) + (8 * cpf[9]) + (9 * cpf[10]);
        
        int j = Mod.mod(Mod.mod(sj, 11), 10);
        int k = Mod.mod(Mod.mod(sk, 11), 10);
        
        return j == cpf[10] && k == cpf[11];
    }
    
    /**
     * Verifica se um dado CPF é válido
     * @param cpf CPF a ser validado
     * @return true caso o CPF seja válido e false caso contrário
     */
    public static boolean cpf2(int[] cpf) {
        if (cpf.length != 12) {
            throw new IllegalArgumentException("tamanho inválido");
        }
        
        if (cpf[0] != 0) {
            throw new IllegalArgumentException("primeiro digito inválido");
        }
        
        int count = 8;
        
        int p = cpf[9];
        int s = cpf[9];
        
        while(count >= 1) {
            p += cpf[count];
            s += p;
            count--;
        }
        
        int j = Mod.mod(Mod.mod(s, 11), 10);
        int k = Mod.mod(Mod.mod(s - p + (9 * j), 11), 10);
        
        return j == cpf[10] && k == cpf[11];
    }
}
