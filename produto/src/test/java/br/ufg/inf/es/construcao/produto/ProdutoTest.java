package br.ufg.inf.es.construcao.produto;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Produto.produto(-1, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Produto.produto(1, -10);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Produto.produto(0, 1), 0.0);
        Assert.assertEquals(0, Produto.produto(1, 0), 0.0);
        Assert.assertEquals(10, Produto.produto(1, 10), 0.0);
        Assert.assertEquals(10, Produto.produto(10, 1), 0.0);
    }

    @Test
    public void testCasosTriviais() {
        Assert.assertEquals(100, Produto.produto(10, 10), 0.0);
        Assert.assertEquals(1000, Produto.produto(10, 100), 0.0);
        Assert.assertEquals(987 * 19, Produto.produto(987, 19), 0.0);
    }
}