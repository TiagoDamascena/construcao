package br.ufg.inf.es.construcao.raiz;

import org.junit.Test;
import org.junit.Assert;

public class RaizTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoRaiz() {
        Raiz.raizQuadrada(0, 2);
    }

    @Test
    public void testCasoDeFronteiraRaiz() {
        Assert.assertEquals(1, Raiz.raizQuadrada(1, 2), 0.0);
    }

    @Test
    public void testCasosTriviaisRaiz() {
        Assert.assertEquals(2, Raiz.raizQuadrada(4, 10), 0.0);
        Assert.assertEquals(3, Raiz.raizQuadrada(9, 10), 0.0);
        Assert.assertEquals(4, Raiz.raizQuadrada(16, 10), 0.0);
    }

    @Test
    public void testCasosNaoTriviaisRaiz() {
        Assert.assertEquals(12, Raiz.raizQuadrada(144, 10), 0.0);
        Assert.assertEquals(25, Raiz.raizQuadrada(625, 10), 0.0);
        Assert.assertEquals(45, Raiz.raizQuadrada(2025, 10), 0.0);
    }

}
