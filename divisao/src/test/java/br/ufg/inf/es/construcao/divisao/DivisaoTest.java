/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcao.divisao;

import org.junit.Test;
import org.junit.Assert;

public class DivisaoTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testDivisorInvalido() {
        Divisao.divideSomas(-1, 1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testDividendoInvalido() {
        Divisao.divideSomas(1, 0);
    }
    
    @Test
    public void testDivideSomas() {
        Assert.assertEquals(5, Divisao.divideSomas(10, 2));
        Assert.assertEquals(5, Divisao.divideSomas(25, 5));
        Assert.assertEquals(8, Divisao.divideSomas(64, 8));
    }
    
}
