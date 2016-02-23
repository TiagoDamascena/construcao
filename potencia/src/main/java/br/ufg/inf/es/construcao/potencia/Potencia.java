package br.ufg.inf.es.construcao.potencia;

/**
 * Fun��o para calculo da potencia de um numero.
 */
public class Potencia {

    /**
     * Calcula a pot�ncia de um n�mero elevado a outro.
     * @param base Base da exponencia��o.
     * @param expoente Expoente da exponencia��o.
     * @return O resultado da exponencia��o.
     * @throws IllegalArgumentException Caso a base ou 
     * o expoente n�o estejam na faixa admitida.
     * A base deve ser um valor maior que 0.
     * O expoente n�o pode ser negativo.
     */
    public static double potencia(double base, int expoente) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base inv�lida");
        }
        
        if (expoente < 0) {
            throw new IllegalArgumentException("Expoente inv�lido");
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
     * Calcula a pot�ncia de um n�mero elevado a outro atrav�s de somas.
     * @param base Base da exponencia��o.
     * @param expoente Expoente da exponencia��o.
     * @return O resultado da exponencia��o.
     * @throws IllegalArgumentException Caso a base ou 
     * o expoente n�o estejam na faixa admitida.
     * A base deve ser um valor maior que 0.
     * O expoente n�o pode ser negativo.
     */
    public static double potenciaSoma(double base, int expoente) {
        if (base <= 0) {
            throw new IllegalArgumentException("Base inv�lida");
        }
        
        if (expoente < 0) {
            throw new IllegalArgumentException("Expoente inv�lido");
        }
        
        int i = 1;
        double potencia = base;
        
        if (expoente == 0) {
            potencia = 1;
        }
        
        while (i < expoente) {
            potencia = potencia * base;
            i = i + 1;
        }
        
        return potencia;
    }
}
