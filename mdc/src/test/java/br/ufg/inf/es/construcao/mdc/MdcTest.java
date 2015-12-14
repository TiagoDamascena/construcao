package br.ufg.inf.es.construcao.mdc;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class MdcTest {
    
    //Testes Mdc
    @Test(expected=IllegalArgumentException.class)
    public void testAInvalidoMdc() {
        Mdc.mdc(1, 2);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testBInvalidoMdc() {
        Mdc.mdc(2, -1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCasoDeFronteiraMdc() {
        Mdc.mdc(2, 0);
    }

    @Test
    public void testCasosTriviaisMdc() throws Exception {
        assertEquals(1, Mdc.mdc(2, 1));
        assertEquals(2, Mdc.mdc(2, 2));
        assertEquals(3, Mdc.mdc(6, 3));
    }

    @Test
     public void testCasosNaoTriviaisMdc() throws Exception {
        assertEquals(4, Mdc.mdc(12, 8));
        assertEquals(3, Mdc.mdc(9, 6));
        assertEquals(6, Mdc.mdc(30, 12));
    }
    
    //Testes Mdc2
    @Test(expected=IllegalArgumentException.class)
    public void testAInvalidoMdc2() {
        Mdc.mdc(1, 2);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testBInvalidoMdc2() {
        Mdc.mdc(2, -1);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testCasoDeFronteiraMdc2() {
        Mdc.mdc(2, 0);
    }

    @Test
     public void testCasosTriviaisMdc2() throws Exception {
        assertEquals(1, Mdc.mdc(2, 1));
        assertEquals(2, Mdc.mdc(2, 2));
        assertEquals(3, Mdc.mdc(6, 3));
    }

    @Test
     public void testCasosNaoTriviaisMdc2() throws Exception {
        assertEquals(4, Mdc.mdc(12, 8));
        assertEquals(3, Mdc.mdc(9, 6));
        assertEquals(6, Mdc.mdc(30, 12));
    }
}