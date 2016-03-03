package br.ufg.inf.es.construcao.pi;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class PiTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() {
        Pi.pi(0);
    }

    @Test
    public void testCasoDeFronteiraPi() {
        assertEquals(4, Pi.pi(1), 0.0);
    }

    @Test
    public void testPi() {
        assertEquals(2.666666666666667, Pi.pi(2), 0.0);
    }
}
