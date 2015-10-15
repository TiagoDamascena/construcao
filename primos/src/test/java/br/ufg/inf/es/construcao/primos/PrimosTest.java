package br.ufg.inf.es.construcao.primos;

import org.junit.Assert;
import org.junit.Test;

public class PrimosTest {

    @Test(expected = IllegalArgumentException.class)
    public void testValorDeNInvalido() {
        Primos.crivoEratostenes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVetorTamanhoInvalido() {
        Primos.crivoEratostenes(new int[] { 1 }, 2);
    }

    @Test
    public void testDoisPrimo() {
        int[] a = {1, 2, 0};
        Primos.crivoEratostenes(a, 2);
        Assert.assertEquals(0, a[2]);
    }

    @Test
    public void testSeisNaoPrimo() {
        int[] a = {1, 2, 0, 0, 0, 0, 0};
        Primos.crivoEratostenes(a, 6);
        Assert.assertEquals(1, a[6]);
    }

    @Test
    public void testCemNaoPrimo() {
        int[] a = new int[101];
        Primos.crivoEratostenes(a, 100);
        Assert.assertEquals(1, a[100]);
        Assert.assertEquals(0, a[17]);
        Assert.assertEquals(0, a[31]);
    }
}