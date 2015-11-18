package br.ufg.inf.es.construcao.potencia;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PotenciaTest {

    @Test(expected=IllegalArgumentException.class)
    public void testBaseInvalida() {
        Potencia.potencia(-1, 2);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testExpoenteInvalido() {
        Potencia.potencia(2, -2);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCasoDeFronteira() {
        Potencia.potencia(0, 1);
        Potencia.potencia(1,-1);
    }

    @Test
     public void testCasosTriviais() throws Exception {
        
        assertEquals(1, Potencia.potencia(1, 2), 0.0);
        assertEquals(1, Potencia.potencia(2, 0), 0.0);
        assertEquals(2, Potencia.potencia(2, 1), 0.0);
        assertEquals(4, Potencia.potencia(2, 2), 0.0);
    }

    @Test
     public void testCasosNaoTriviais() throws Exception {
        
        assertEquals(25, Potencia.potencia(5, 2), 0.0);
        assertEquals(2187, Potencia.potencia(3, 7), 0.0);
    }
    
}