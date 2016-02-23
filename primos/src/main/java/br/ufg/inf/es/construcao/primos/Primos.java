package br.ufg.inf.es.construcao.primos;

/**
 * Serviõos relacionados a números primos
 */
public class Primos {
    
    /**
     * Verifica se um número é primo ou não
     * @param numero Número a ser verificado
     * @return Verdadeiro caso seja primo e falso caso não seja
     * @throws IllegalArgumentException Caso o numero 
     * não estejam na faixa admitida
     * O numero deve ser um valor maior ou igual a 2.
     */
    public static boolean primo(int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("Número inválido");
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
     * Coloca a lista dos n primeiros números primos em um vetor
     * @param vetor Vetor que receberá a lista de números primos.
     * @param numero Quantidade de números primos a serem colocados no vetor
     * @throws IllegalArgumentException Caso o numero 
     * não estejam na faixa admitida, o tamanho do vetor
     * não esteja na faixa admitida e o vetor não esteja
     * povoado por 0.
     * O numero deve ser um valor maior ou igual a 2.
     * O tamanho do vetor deve ser maior ou igual a n.
     */
    public static void crivoEratostenes(int[] vetor, int numero)
    {
        if (numero < 2) {
            throw new IllegalArgumentException("Número inválido");
        }

        if (vetor.length <= numero) {
            throw new IllegalArgumentException("Tamanho do vetor inválido");
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
