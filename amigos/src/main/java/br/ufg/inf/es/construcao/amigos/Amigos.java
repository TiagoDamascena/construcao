package br.ufg.inf.es.construcao.amigos;

import br.ufg.inf.es.construcao.somadivisores.SomaDivisores;

/**
 * Funções relacionadas a números amigos
 */
public class Amigos {
    
    /**
     * Diz se dois números são amigos ou não.
     *
     * @param numero1 número 1
     * @param numero2 número 2
     *
     * @return true caso sejam amigos e false caso não sejam. 
     */
    public static boolean amigos(int numero1, int numero2) {
        if (numero1 <= 0) {
            throw new IllegalArgumentException("numero1 inválido");
        }
        
        if (numero2 <= 0) {
            throw new IllegalArgumentException("numero2 inválido");
        }
        
        int somaNumero1 = SomaDivisores.somaDivisores(numero1);
        int somaNumero2 = SomaDivisores.somaDivisores(numero2);
        
        return somaNumero1 == numero2 && somaNumero2 == numero1;
    }
}
