package br.ufg.inf.es.construcao.propriedade;

import org.junit.Test;
import org.junit.Assert;

public class PropriedadeTest {
    
    //Testes propriedade153
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido153() {
        Propriedade.propriedade153(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCasoDeFronteira153() {
        Propriedade.propriedade153(-1);
        Propriedade.propriedade153(1000);
    }

    @Test
    public void testCasoTrivial153() {
        Assert.assertTrue(Propriedade.propriedade153(153));
    }

    @Test
    public void testFalse153() {
        Assert.assertFalse(Propriedade.propriedade153(12));
    }
    
    //Teste propriedade3025
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido3025() {
        Propriedade.propriedade3025(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCasoDeFronteira3025() {
        Propriedade.propriedade3025(-1);
        Propriedade.propriedade3025(10000);
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
    public void testFalse3025() {
        Assert.assertFalse(Propriedade.propriedade3025(3205));
    }
    
    //Teste PropriedadeSomaFatorial
    @Test
    public void testPropriedadeSomaFatorial() {
        Assert.assertEquals(1, Propriedade.propriedadeSomaFatorial());
    }
}