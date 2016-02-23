package br.ufg.inf.es.construcao.amigos;

import br.ufg.inf.es.construcao.somadivisores.SomaDivisores;

/**
 * N�meros amigo
 */
public class Amigos {
    
    /**
     * Verifica se sois n�meros s�o considerados amigos
     * @param numero1 primeiro numero
     * @param numero2 segundo numero
     * @return true caso sejam amigos e false caso contr�rio
     */
    public static boolean amigos(int numero1, int numero2) {
        if (numero1 <= 0) {
            throw new IllegalArgumentException("Numero1 inv�lido");
        }
        
        if (numero2 <= 0) {
            throw new IllegalArgumentException("Numero2 inv�lido");
        }
        
        int somaNumero1 = SomaDivisores.somaDivisores(numero1);
        int somaNumero2 = SomaDivisores.somaDivisores(numero2);
        
        return somaNumero1 == numero2 && somaNumero2 == numero1;
    }
}
