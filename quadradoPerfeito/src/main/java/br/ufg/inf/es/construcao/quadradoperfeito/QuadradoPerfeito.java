package br.ufg.inf.es.construcao.quadradoperfeito;

/**
 * Fun��es relacionadas a um quadrado perfeito
 */
public class QuadradoPerfeito {
    
    /**
     * verifica se um n�mero a um quadrado perfeito.
     * @param numero n�mero a ser verificado.
     * @return verdadeiro caso o numero seja um quadrado perfeito e falso caso contrário.
     * @throws caso o n�mero seja menor que 1.
     */
    public static boolean quadradoPerfeito(int numero) {
        if(numero < 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
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
