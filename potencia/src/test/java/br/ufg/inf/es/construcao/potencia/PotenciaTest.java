package br.ufg.inf.es.construcao.potencia;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class PotenciaTest {
    
    //Testes Potencia
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
    
    //Testes PotenciaSoma
    @Test(expected=IllegalArgumentException.class)
    public void testBaseInvalidaSoma() {
        Potencia.potenciaSoma(-1, 2);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testExpoenteInvalidoSoma() {
        Potencia.potenciaSoma(2, -2);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCasoDeFronteiraSoma() {
        Potencia.potenciaSoma(0, 1);
        Potencia.potenciaSoma(1,-1);
    }

    @Test
     public void testCasosTriviaisSoma() throws Exception {      
        assertEquals(1, Potencia.potenciaSoma(1, 2), 0.0);
        assertEquals(1, Potencia.potenciaSoma(2, 0), 0.0);
        assertEquals(2, Potencia.potenciaSoma(2, 1), 0.0);
        assertEquals(4, Potencia.potenciaSoma(2, 2), 0.0);
    }

    @Test
     public void testCasosNaoTriviaisSoma() throws Exception {      
        assertEquals(25, Potencia.potenciaSoma(5, 2), 0.0);
        assertEquals(2187, Potencia.potenciaSoma(3, 7), 0.0);
    }
}