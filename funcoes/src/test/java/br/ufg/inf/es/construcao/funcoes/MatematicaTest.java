package br.ufg.inf.es.construcao.funcoes;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class MatematicaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCasosDeFronteira() {
        Matematica.somaNaturais(0);
    }

    @Test
    public void testCasosTriviais() throws Exception {
        assertEquals(1, Matematica.somaNaturais(1));
        assertEquals(3, Matematica.somaNaturais(2));
        assertEquals(6, Matematica.somaNaturais(3));
        assertEquals(10, Matematica.somaNaturais(4));
    }

    @Test
    public void testCasosNaoTriviais() {
        assertEquals(100*101/2, Matematica.somaNaturais(100));
        assertEquals(1005*1006/2, Matematica.somaNaturais(1005));
    }
}