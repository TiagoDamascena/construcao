package br.ufg.inf.es.construcao.fatorial;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class FatorialTest {
    //Testes Fatorial
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalido() {
        Fatorial.fatorial(0);
    }

    @Test
    public void testFatorial() {
        assertEquals(1, Fatorial.fatorial(1));
        assertEquals(2, Fatorial.fatorial(2));
        assertEquals(6, Fatorial.fatorial(3));
    }
    //Testes Fatorial Soma
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalidoSoma() {
        Fatorial.fatorialSoma(0);
    }
    
    @Test
    public void testFatorialSoma() {
        assertEquals(1, Fatorial.fatorialSoma(1));
        assertEquals(2, Fatorial.fatorialSoma(2));
        assertEquals(6, Fatorial.fatorialSoma(3));
    }
}
