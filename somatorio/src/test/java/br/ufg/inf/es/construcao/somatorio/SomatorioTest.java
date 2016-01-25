package br.ufg.inf.es.construcao.somatorio;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SomatorioTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalido() {
        Somatorio.somatorio(0);
    }
    
    @Test
    public void testSomatorio() {
        assertEquals(0.5, Somatorio.somatorio(1), 0.0);
        assertEquals(0.7, Somatorio.somatorio(2), 0.0);
    }
}
