package br.ufg.inf.es.construcao.amigos;

import org.junit.Test;
import org.junit.Assert;

public class AmigosTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumero1InvalidoAmigos() {
        Amigos.amigos(0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumero2InvalidoAmigos() {
        Amigos.amigos(10, 0);
    }

    @Test
    public void testAlgunsAmigos() {
        Assert.assertTrue(Amigos.amigos(220, 284));
        Assert.assertTrue(Amigos.amigos(17296, 18416));
    }

    @Test
    public void testAlgunsNaoAmigos() {
        Assert.assertFalse(Amigos.amigos(375, 496));
        Assert.assertFalse(Amigos.amigos(2385, 137));
    }
}
