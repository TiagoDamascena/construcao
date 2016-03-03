package br.ufg.inf.es.construcao.propriedade;

import org.junit.Test;
import org.junit.Assert;

public class PropriedadeTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido153() {
        Propriedade.propriedade153(-2);
    }

    @Test
    public void testCasoDeFronteira153() {
        Assert.assertFalse(Propriedade.propriedade153(0));
        Assert.assertFalse(Propriedade.propriedade153(999));
    }

    @Test
    public void testCasoTrivial153() {
        Assert.assertTrue(Propriedade.propriedade153(153));
    }

    @Test
    public void testNaoAtende53() {
        Assert.assertFalse(Propriedade.propriedade153(12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido3025() {
        Propriedade.propriedade3025(-5);
    }

    @Test
    public void testCasoDeFronteira3025() {
        Assert.assertTrue(Propriedade.propriedade3025(0));
        Assert.assertFalse(Propriedade.propriedade3025(9999));
    }

    @Test
    public void testCasoTrivial3025() {
        Assert.assertTrue(Propriedade.propriedade3025(3025));
    }

    @Test
    public void testCasoNaoTrivial3025() {
        Assert.assertTrue(Propriedade.propriedade3025(9801));
    }

    @Test
    public void testNaoAtende3025() {
        Assert.assertFalse(Propriedade.propriedade3025(3205));
    }

    @Test
    public void testPropriedadeSomaFatorial() {
        Assert.assertEquals(1, Propriedade.propriedadeSomaFatorial());
    }
}
