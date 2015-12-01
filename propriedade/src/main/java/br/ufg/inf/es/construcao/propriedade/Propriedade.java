package br.ufg.inf.es.construcao.propriedade;

/**
 * Função para verificação da propriedades de um número.
 */
public class Propriedade {

    /**
     * Verifica se um número atende a propriedade 153
     *
     * @param numero Numero a ser verificado.
     *
     * @return Verdadeiro caso atenda, e falso caso não atenda.
     *
     * @throws IllegalArgumentException Caso o numero 
     * não estejam na faixa admitida.
     * O numero deve ser um valor maior ou igual a 0 e menor ou igual a 999.
     */
    public static boolean propriedade153(int numero) {
        if (numero < 0 || numero > 999) {
            throw new IllegalArgumentException("número inválido");
        }
        
        int i = numero / 100;
        int j = (numero - 100) / 10;
        int k = numero % 10;
        
        int n = (i*i*i) + (j*j*j) + (k*k*k);
        
        if(n == numero) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Verifica se um número atende a propriedade 3025
     *
     * @param numero Numero a ser verificado.
     *
     * @return Verdadeiro caso atenda, e falso caso não atenda.
     *
     * @throws IllegalArgumentException Caso o numero 
     * não estejam na faixa admitida.
     * O numero deve ser um valor maior ou igual a 0 e menor ou igual a 9999.
     */
    public static boolean propriedade3025(int numero) {
        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("número inválido");
        }
        
        int i = numero / 100;
        int j = numero % 100;
        
        int n = i + j;
        
        if(n*n == numero) {
            return true;
        }
        else {
            return false;
        }
    }
}
