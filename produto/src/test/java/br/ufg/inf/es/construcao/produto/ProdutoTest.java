package br.ufg.inf.es.construcao.produto;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCoeficienteProdutoInvalido() throws Exception {
        Produto.produto(-1, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCoeficiente2ProdutoInvalido() throws Exception {
        Produto.produto(10, -1);
    }

    @Test
    public void testProdutoCasosDeFronteira() {
        Assert.assertEquals(0, Produto.produto(0, 1), 0.0);
        Assert.assertEquals(0, Produto.produto(1, 0), 0.0);
    }

    @Test
    public void testProdutoCasosTriviais() {
        Assert.assertEquals(100, Produto.produto(10, 10), 0.0);
        Assert.assertEquals(1000, Produto.produto(10, 100), 0.0);
    }

    @Test
    public void testPrdutoCasosNaoTriviais() {
        Assert.assertEquals(987 * 19, Produto.produto(987, 19), 0.0);
        Assert.assertEquals(1001 * 27, Produto.produto(1001, 27), 0.0);
    }
}
