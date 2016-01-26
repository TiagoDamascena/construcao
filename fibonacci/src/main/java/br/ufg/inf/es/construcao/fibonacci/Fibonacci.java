package br.ufg.inf.es.construcao.fibonacci;

/**
 * Função para obter um número da sequência de Fibonacci
 */
public class Fibonacci {
    
    /**
     * Calcula um determinado número na sequência de fibonacci.
     *
     * @param numero qual número da sequência.
     *
     * @return o número de fibonacci na posição solicitada dentro da sequência.
     *
     * @throws  IllegalArgumentException caso o numero informado seja menor que 0.
     */
    public static int fibonacci(int numero) {
        if(numero < 0) {
            throw new IllegalArgumentException("numero inválido");
        }
        
        int anterior = 0;
        int corrente = 1;
        
        if(numero==0 || numero==1) {
            return numero;
        }
        
        int i = 2;
        
        while(i <= numero) {
            int temporario = corrente;
            corrente += anterior;
            anterior = temporario;
            i++;
        }
        
        return corrente;
    }
}
