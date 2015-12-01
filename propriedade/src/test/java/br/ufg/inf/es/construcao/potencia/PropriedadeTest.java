package br.ufg.inf.es.construcao.propriedade;

import org.junit.Test;
import org.junit.Assert;

public class PropriedadeTest {

    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalido() {
        Propriedade.propriedade153(-2);
        Propriedade.propriedade3025(-5);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCasoDeFronteira() {
        Propriedade.propriedade153(-1);
        Propriedade.propriedade3025(-1);
        Propriedade.propriedade153(1000);
        Propriedade.propriedade3025(10000);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        Assert.assertTrue(Propriedade.propriedade153(153));
        Assert.assertTrue(Propriedade.propriedade3025(3025));
    }

    @Test
    public void testCasosNaoTriviais() throws Exception {
        
        Assert.assertTrue(Propriedade.propriedade153(153));
        Assert.assertTrue(Propriedade.propriedade3025(9801));
        Assert.assertFalse(Propriedade.propriedade153(12));
        Assert.assertFalse(Propriedade.propriedade3025(3205));
    }
}