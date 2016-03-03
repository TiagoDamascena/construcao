package br.ufg.inf.es.construcao.divisao;

import org.junit.Test;
import org.junit.Assert;

public class DivisaoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDivisorInvalidoDivideSomas() {
        Divisao.divideSomas(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividendoInvalidoDivideSomas() {
        Divisao.divideSomas(1, 0);
    }

    @Test
    public void testCasoDeFronteiraDivideSomas() {
        Assert.assertEquals(0, Divisao.divideSomas(0, 5));
        Assert.assertEquals(10, Divisao.divideSomas(10, 1));
    }

    @Test
    public void testTriviaisDivideSomas() {
        Assert.assertEquals(5, Divisao.divideSomas(10, 2));
        Assert.assertEquals(5, Divisao.divideSomas(25, 5));
        Assert.assertEquals(8, Divisao.divideSomas(64, 8));
    }

    @Test
    public void testNaoTriviaisDivideSomas() {
        Assert.assertEquals(104, Divisao.divideSomas(312, 3));
        Assert.assertEquals(236, Divisao.divideSomas(472, 2));
        Assert.assertEquals(3, Divisao.divideSomas(963, 321));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisorInvalidoDivideSubtracao() {
        Divisao.divideSubtracao(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividendoInvalidoDivideSubtracao() {
        Divisao.divideSubtracao(1, 0);
    }

    @Test
    public void testCasoDeFronteiraDivideSubtracao() {
        Assert.assertEquals(0, Divisao.divideSubtracao(0, 5));
        Assert.assertEquals(10, Divisao.divideSubtracao(10, 1));
    }

    @Test
    public void testTriviaisDivideSubtracao() {
        Assert.assertEquals(5, Divisao.divideSubtracao(10, 2));
        Assert.assertEquals(5, Divisao.divideSubtracao(25, 5));
        Assert.assertEquals(8, Divisao.divideSubtracao(64, 8));
    }

    @Test
    public void testNaoTriviaisDivideSubtracao() {
        Assert.assertEquals(104, Divisao.divideSubtracao(312, 3));
        Assert.assertEquals(236, Divisao.divideSubtracao(472, 2));
        Assert.assertEquals(3, Divisao.divideSubtracao(963, 321));
    }
}
