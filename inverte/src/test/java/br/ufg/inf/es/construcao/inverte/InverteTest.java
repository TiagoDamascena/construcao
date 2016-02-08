package br.ufg.inf.es.construcao.inverte;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author tiago
 */
public class InverteTest {

    @Test
    public void testInverteUm() {
        Assert.assertEquals("a", Inverte.inverte("a"));
    }
    
    @Test
    public void testInverte() {
        Assert.assertEquals("iO", Inverte.inverte("Oi"));
        Assert.assertEquals("anoicnuf", Inverte.inverte("funciona"));
    }
    
}
