package br.ufg.inf.es.construcao.logaritmo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kyriosdata on 10/15/15.
 */
public class LogaritmoTest {

    @Test
    public void algunsExemplos() {
        assertEquals(2.5d, Logaritmo.logn(1, 2), 0.000000000001d);
    }

}