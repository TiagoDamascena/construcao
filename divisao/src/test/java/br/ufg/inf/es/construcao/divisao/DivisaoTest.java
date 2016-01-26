package br.ufg.inf.es.construcao.divisao;

import org.junit.Test;
import org.junit.Assert;

public class DivisaoTest {
    //Testes Soma
    @Test(expected=IllegalArgumentException.class)
    public void testDivisorInvalidoSoma() {
        Divisao.divideSomas(-1, 1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testDividendoInvalidoSoma() {
        Divisao.divideSomas(1, 0);
    }
    
    @Test
    public void testDivideSomas() {
        Assert.assertEquals(5, Divisao.divideSomas(10, 2));
        Assert.assertEquals(5, Divisao.divideSomas(25, 5));
        Assert.assertEquals(8, Divisao.divideSomas(64, 8));
    }
    //Testes Subtração
    @Test(expected=IllegalArgumentException.class)
    public void testDivisorInvalidoSubtracao() {
        Divisao.divideSubtracao(-1, 1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testDividendoInvalidoSubtracao() {
        Divisao.divideSubtracao(1, 0);
    }
    
    @Test
    public void testDivideSubtracao() {
        Assert.assertEquals(5, Divisao.divideSubtracao(10, 2));
        Assert.assertEquals(5, Divisao.divideSubtracao(25, 5));
        Assert.assertEquals(8, Divisao.divideSubtracao(64, 8));
    }
}
