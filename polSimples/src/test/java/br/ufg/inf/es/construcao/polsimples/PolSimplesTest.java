package br.ufg.inf.es.construcao.polsimples;

import org.junit.Test;
import org.junit.Assert;

public class PolSimplesTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalidoPolinomioSimples() {
        float[] vetor = {};
        PolSimples.polSimples(1, vetor);
    }

    @Test
    public void testPolinomioSimples() {
        float[] vetor = {10, 3, 2};
        Assert.assertEquals(24, PolSimples.polSimples(2, vetor), 0.0);
    }

    @Test
    public void testPolinomioSimplesValorNegativo() {
        float[] vetor = {-3, 2.5F, 3, 6, 4.75F, 8};
        Assert.assertEquals(21.25, PolSimples.polSimples(1, vetor), 0.0);
    }

}
