package br.ufg.inf.es.construcao.potencia;

import br.ufg.inf.es.construcao.produto;

/**
 * Função para calculo da potencia de um numero.
 */
public class Potencia {

    /**
     * Calcula a potência de um número elevado a outro.
     *
     * @param base Base da exponenciação.
     * @param expoente Expoente da exponenciação.
     *
     * @return O resultado da exponenciação.
     *
     * @throws IllegalArgumentException Caso a base ou 
     * o expoente não estejam na faixa admitida.
     * A base deve ser um valor maior que 0.
     * O expoente não pode ser negativo.
     */
    public static double potencia(double base, int expoente) {
        if (base <= 0) {
            throw new IllegalArgumentException("base inválida");
        }
        
        if (expoente < 0) {
            throw new IllegalArgumentException("expoente inválido");
        }
        
        int i = 1;
        double potencia = 1;
        
        while (i <= expoente) {
            potencia = potencia * base;
            i = i + 1;
        }
        
        return potencia;
    }
    
    /**
     * Calcula a potência de um número elevado a outro através de somas.
     *
     * @param base Base da exponenciação.
     * @param expoente Expoente da exponenciação.
     *
     * @return O resultado da exponenciação.
     *
     * @throws IllegalArgumentException Caso a base ou 
     * o expoente não estejam na faixa admitida.
     * A base deve ser um valor maior que 0.
     * O expoente não pode ser negativo.
     */
    public static double potenciaSoma(double base, int expoente) {
        if (base <= 0) {
            throw new IllegalArgumentException("base inválida");
        }
        
        if (expoente < 0) {
            throw new IllegalArgumentException("expoente inválido");
        }
        
        int i = 1;
        double potencia = base;
        
        while (i < expoente) {
            potencia = Produto.produto(potencia, base);
            i = i + 1;
        }
        
        return potencia;
    }
}
