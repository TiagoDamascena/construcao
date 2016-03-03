package br.ufg.inf.es.construcao.somadivisores;

import org.junit.Assert;
import org.junit.Test;

public class SomaDivisoresTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoSomaDivisores() {
        SomaDivisores.somaDivisores(0);
    }

    @Test
    public void testCasoDeFronteiraSomaDivisores() {
        Assert.assertEquals(1, SomaDivisores.somaDivisores(1));
    }

    @Test
    public void testCasosTriviaisSomaDivisores() {
        Assert.assertEquals(1, SomaDivisores.somaDivisores(2));
        Assert.assertEquals(3, SomaDivisores.somaDivisores(4));
    }

    @Test
    public void testCasosNaoTriviaisSomaDivisores() {
        Assert.assertEquals(8, SomaDivisores.somaDivisores(10));
        Assert.assertEquals(10, SomaDivisores.somaDivisores(14));
    }
}
