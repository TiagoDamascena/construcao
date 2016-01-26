package br.ufg.inf.es.construcao.mod;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class ModTest {
    //Testes Mod
    @Test(expected=IllegalArgumentException.class)
    public void testDivisorInvalido() {
        Mod.mod(0, 1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testDividendoInvalido() {
        Mod.mod(1, -1);
    }

    @Test
    public void testMod() {
        assertEquals(1, Mod.mod(10, 3));
        assertEquals(2, Mod.mod(5, 3));
        assertEquals(2, Mod.mod(30, 4));
    }
    //Teste Mod Simples
    @Test(expected=IllegalArgumentException.class)
    public void testDivisorInvalidoSimples() {
        Mod.modSimples(0, 1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testDividendoInvalidoSimples() {
        Mod.modSimples(1, 0);
    }

    @Test
    public void testModSimples() {
        assertEquals(1, Mod.modSimples(10, 3));
        assertEquals(2, Mod.modSimples(5, 3));
        assertEquals(2, Mod.modSimples(30, 4));
    }
}
