package br.ufg.inf.es.construcao.harmonico;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class HarmonicoTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalido() {
        Harmonico.numeroHarmonico(0);
    }
    
    @Test
    public void testTrivial() {
        assertEquals(1, Harmonico.numeroHarmonico(1), 0.0);
        assertEquals(1.5, Harmonico.numeroHarmonico(2), 0.0);
    }
}
