package br.ufg.inf.es.construcao.somaarray;

import org.junit.Test;
import org.junit.Assert;

public class SomaArrayTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testDivisorInvalido() {
        int[] vetor = {0, 1};
        SomaArray.somaArray(vetor, -1);
    }
    
    @Test
    public void testSomaArray() {
        int[] vetor = {1, 3, 5, 7, 9};
        Assert.assertEquals(25, SomaArray.somaArray(vetor, 4));
        
        int[] vetor2 = {12, 7, 1, 0, 6, 9, 11, 19};
        Assert.assertEquals(35, SomaArray.somaArray(vetor2, 5));
    }
    
}
