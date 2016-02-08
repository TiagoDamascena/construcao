package br.ufg.inf.es.construcao.dividearray;

import org.junit.Test;
import org.junit.Assert;

public class DivideArrayTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testDivisorInvalido() {
        int[] vetor = {0, 1};
        DivideArray.divideArray(vetor, -1);
    }

    @Test
    public void testDivideArray() {
        int[] vetor = {1, 3, 5, 7, 9};
        Assert.assertEquals(12.5, DivideArray.divideArray(vetor, 4), 0.0);
        
        int[] vetor2 = {12, 7, 1, 0, 5, 9, 11, 19};
        Assert.assertEquals(17, DivideArray.divideArray(vetor2, 5), 0.0);
    }
    
}
