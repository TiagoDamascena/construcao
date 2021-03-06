package br.ufg.inf.es.construcao.primos;

import org.junit.Assert;
import org.junit.Test;

public class PrimosTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoPrimo() {
        Primos.primo(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCasoDeFronteiraPrimo() {
        Primos.primo(1);
    }

    @Test
    public void testNumerosPrimos() throws Exception {
        Assert.assertTrue(Primos.primo(2));
        Assert.assertTrue(Primos.primo(3));
    }

    @Test
    public void testNumerosNaoPrimos() throws Exception {
        Assert.assertFalse(Primos.primo(4));
        Assert.assertFalse(Primos.primo(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVetorTamanhoInvalidoCrivo() {
        Primos.crivoEratostenes(new int[]{1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVetorPovoadoCrivo() {
        int[] a = {1, 2, 0, 5, 7, 9, 2};
        Primos.crivoEratostenes(a);
    }

    @Test
    public void testDoisPrimoCrivo() {
        int[] a = new int[3];
        Primos.crivoEratostenes(a);
        Assert.assertEquals(0, a[2]);
    }

    @Test
    public void testCemNaoPrimo() {
        int[] a = new int[120];
        Primos.crivoEratostenes(a);
        Assert.assertEquals(1, a[100]);
    }
}
