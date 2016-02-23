package br.ufg.inf.es.construcao.primos;

/**
 * Servi�os relacionados a n�meros primos
 */
public class Primos {
    
    /**
     * Verifica se um n�mero � primo ou n�o
     * @param numero N�mero a ser verificado
     * @return Verdadeiro caso seja primo e falso caso n�o seja
     * @throws IllegalArgumentException Caso o numero 
     * n�o estejam na faixa admitida
     * O numero deve ser um valor maior ou igual a 2.
     */
    public static boolean primo(int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }
        
        int i = 2;
        
        while (i < numero) {
            if(numero % i == 0) {
                return false;
            }
            
            i = i + 1;
        }
        
        return true;
    }
    
    /**
     * Coloca a lista dos n primeiros n�meros primos em um vetor
     * @param vetor Vetor que receber� a lista de n�meros primos.
     * @param numero Quantidade de n�meros primos a serem colocados no vetor
     * @throws IllegalArgumentException Caso o numero 
     * n�o estejam na faixa admitida, o tamanho do vetor
     * n�o esteja na faixa admitida e o vetor n�o esteja
     * povoado por 0.
     * O numero deve ser um valor maior ou igual a 2.
     * O tamanho do vetor deve ser maior ou igual a n.
     */
    public static void crivoEratostenes(int[] vetor, int numero)
    {
        if (numero < 2) {
            throw new IllegalArgumentException("N�mero inv�lido");
        }

        if (vetor.length <= numero) {
            throw new IllegalArgumentException("Tamanho do vetor inv�lido");
        }

        for (int i = 2; i <= numero; i++) {
            if (vetor[i] != 0) {
                throw new IllegalArgumentException("Valor incorreto dentro do vetor");
            }
        }

        int i = 2;
        int c = 0;
        
        while (i <= numero / 2) {
            if (vetor[i] == 0) {
                c = i + i;
                
                while (c <= numero) {
                    vetor[c] = 1;
                    c = c + i;
                }
            }

            i = i + 1;
        }
    }
}
