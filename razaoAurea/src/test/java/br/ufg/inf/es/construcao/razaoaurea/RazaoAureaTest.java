package br.ufg.inf.es.construcao.razaoaurea;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class RazaoAureaTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testTermo1Invalido() {
        RazaoAurea.razaoAurea(0,1,1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testTermo2Invalido() {
        RazaoAurea.razaoAurea(1,0,1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testFatorInvalido() {
        RazaoAurea.razaoAurea(1,1,0);
    }

    @Test
    public void testRazaoAurea() {
        assertEquals(2, RazaoAurea.razaoAurea(1,1,1), 0.0);
        assertEquals(1.6, RazaoAurea.razaoAurea(1,2,3), 0.0);
    }
    
}
