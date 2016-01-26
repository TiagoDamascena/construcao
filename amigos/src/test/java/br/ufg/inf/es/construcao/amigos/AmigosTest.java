package br.ufg.inf.es.construcao.amigos;

import org.junit.Test;
import org.junit.Assert;

public class AmigosTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testNumero1Invalido() {
        Amigos.amigos(0, 10);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testNumero2Invalido() {
        Amigos.amigos(10, 0);
    }
    
    @Test
    public void testAmigos() {
        Assert.assertTrue(Amigos.amigos(220, 284));
        Assert.assertTrue(Amigos.amigos(17296, 18416));
    }
    
}
