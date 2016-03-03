package br.ufg.inf.es.construcao.polhorner;

import org.junit.Test;
import org.junit.Assert;

public class PolHornerTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalidoHorner() {
        float[] vetor = {};
        PolHorner.polHorner(1, vetor);
    }

    @Test
    public void testHorner() {
        float[] vetor = {10, 3, 2};
        Assert.assertEquals(24, PolHorner.polHorner(2, vetor), 0.0);
    }

    @Test
    public void testHornerXZero() {
        float[] vetor = {8, 2, 9, 21, 6, 9};
        Assert.assertEquals(8, PolHorner.polHorner(0, vetor), 0.0);
    }

    @Test
    public void testHornerValorNegativo() {
        float[] vetor = {-3, 2.5F, 3, 6, 4.75F, 8};
        Assert.assertEquals(21.25, PolHorner.polHorner(1, vetor), 0.0);
    }

    @Test
    public void testHornerXNegativo() {
        float[] vetor = {2, 6, 7, 1, 8, 2};
        Assert.assertEquals(-1228, PolHorner.polHorner(-5, vetor), 0.0);
    }
}
