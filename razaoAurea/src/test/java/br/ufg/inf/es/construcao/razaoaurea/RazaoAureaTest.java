package br.ufg.inf.es.construcao.razaoaurea;

import org.junit.Assert;
import org.junit.Test;

public class RazaoAureaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTermo1InvalidoRazaoAurea() {
        RazaoAurea.razaoAurea(0, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTermo2InvalidoRazaoAurea() {
        RazaoAurea.razaoAurea(1, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFatorInvalidoRazaoAurea() {
        RazaoAurea.razaoAurea(1, 2, 0);
    }

    @Test
    public void testCasosTriviaisRazaoAurea() {
        Assert.assertEquals(1.5, RazaoAurea.razaoAurea(1, 2, 1), 0.0);
        Assert.assertEquals(1.6, RazaoAurea.razaoAurea(1, 2, 3), 0.0);
    }

}
