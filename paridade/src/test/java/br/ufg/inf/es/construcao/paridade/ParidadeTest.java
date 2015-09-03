package br.ufg.inf.es.construcao.paridade;

import org.junit.Assert;
import org.junit.Test;

public class ParidadeTest {

    @Test
    public void testNumerosPares() throws Exception {
        Assert.assertTrue(Paridade.verifica(2));
        Assert.assertTrue(Paridade.verifica(13458));
    }

    @Test
    public void testNumerosImpares() throws Exception {
        Assert.assertFalse(Paridade.verifica(1));
        Assert.assertFalse(Paridade.verifica(13453));
    }
}