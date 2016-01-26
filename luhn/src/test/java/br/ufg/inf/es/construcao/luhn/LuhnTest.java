package br.ufg.inf.es.construcao.luhn;

import org.junit.Test;
import org.junit.Assert;

public class LuhnTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testDiaInvalido() {
        int[] vetor = {1};
        Luhn.luhn(vetor);
    }
    
    @Test
    public void testLuhn() throws Exception {
        int[] vetor = {7,9,9,2,7,3,9,8,7,1,0};
        Assert.assertEquals(3, Luhn.luhn(vetor));
        int[] vetor2 = {3,6,9,4,1,9,2,0};
        Assert.assertEquals(10, Luhn.luhn(vetor2));
    }
}
