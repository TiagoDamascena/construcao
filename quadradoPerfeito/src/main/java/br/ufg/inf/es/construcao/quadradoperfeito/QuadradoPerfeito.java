package br.ufg.inf.es.construcao.quadradoperfeito;

/**
 * Funções relacionadas a um quadrado perfeito
 */
public class QuadradoPerfeito {
    
    /**
     * verifica se um número a um quadrado perfeito.
     * @param numero número a ser verificado.
     * @return verdadeiro caso o numero seja um quadrado perfeito e falso caso contrÃ¡rio.
     * @throws caso o número seja menor que 1.
     */
    public static boolean quadradoPerfeito(int numero) {
        if(numero < 1) {
            throw new IllegalArgumentException("Número inválido");
        }
        
        int i = 1;
        int quadrado = 1;
        
        while(quadrado < numero) {
            i += 2;
            quadrado += i;
        }
        
        return (quadrado == numero);
    }
}
