package br.ufg.inf.es.construcao.somadivisores;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SomaDivisoresTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalidoNatural() {
        SomaDivisores.somaDivisores(0);
    }

    @Test
    public void testSomaDivisores() {
        assertEquals(1, SomaDivisores.somaDivisores(2));
        assertEquals(3, SomaDivisores.somaDivisores(4));
    }
    
}
