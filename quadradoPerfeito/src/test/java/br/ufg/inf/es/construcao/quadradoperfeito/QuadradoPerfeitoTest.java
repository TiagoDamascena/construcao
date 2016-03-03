package br.ufg.inf.es.construcao.quadradoperfeito;

import org.junit.Test;
import org.junit.Assert;

public class QuadradoPerfeitoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoQuadradoPerfeito() {
        QuadradoPerfeito.quadradoPerfeito(0);
    }

    @Test
    public void testCasodeFronteiraQuadradoPerfeito() {
        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(1));
    }

    @Test
    public void testQuadradosPerfeitos() {
        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(16));
        Assert.assertTrue(QuadradoPerfeito.quadradoPerfeito(25));
    }

    @Test
    public void testNaoQuadrados() {
        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(10));
        Assert.assertFalse(QuadradoPerfeito.quadradoPerfeito(72));
    }
}
