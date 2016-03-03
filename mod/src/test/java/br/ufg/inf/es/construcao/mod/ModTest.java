package br.ufg.inf.es.construcao.mod;

import org.junit.Assert;
import org.junit.Test;

public class ModTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDivisorInvalidoMod() {
        Mod.mod(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividendoInvalidoMod() {
        Mod.mod(1, 0);
    }

    @Test
    public void testCasoDeFronteiraMod() {
        Assert.assertEquals(0, Mod.mod(0, 1));
    }

    @Test
    public void testCasosTriviaisMod() {
        Assert.assertEquals(1, Mod.mod(10, 3));
        Assert.assertEquals(2, Mod.mod(5, 3));
    }

    @Test
    public void testCasosNaoTriviaisMod() {
        Assert.assertEquals(2, Mod.mod(30, 4));
        Assert.assertEquals(2, Mod.mod(50, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisorInvalidoModSimples() {
        Mod.modSimples(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividendoInvalidoModSimples() {
        Mod.modSimples(1, 0);
    }

    @Test
    public void testCasoDeFronteiraModSimples() {
        Assert.assertEquals(0, Mod.modSimples(1, 1));
    }

    @Test
    public void testCasosTriviaisModSimples() {
        Assert.assertEquals(1, Mod.modSimples(10, 3));
        Assert.assertEquals(2, Mod.modSimples(5, 3));
    }

    @Test
    public void testCasosNaoTriviaisModSimples() {
        Assert.assertEquals(2, Mod.modSimples(30, 4));
        Assert.assertEquals(2, Mod.modSimples(50, 3));
    }
}
