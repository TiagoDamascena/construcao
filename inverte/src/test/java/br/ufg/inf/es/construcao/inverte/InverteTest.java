package br.ufg.inf.es.construcao.inverte;

import org.junit.Test;
import org.junit.Assert;

public class InverteTest {

    @Test
    public void testInverteUm() {
        Assert.assertEquals("a", Inverte.inverte("a"));
    }

    @Test
    public void testInverteAlgumasPalavras() {
        Assert.assertEquals("iO", Inverte.inverte("Oi"));
        Assert.assertEquals("anoicnuf", Inverte.inverte("funciona"));
        Assert.assertEquals("invertido", Inverte.inverte("oditrevni"));
    }

}
