package br.ufg.inf.es.construcao.potencia;

import org.junit.Test;
import org.junit.Assert;

public class PotenciaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaBaseInvalida() {
        Potencia.potencia(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaExpoenteInvalido() {
        Potencia.potencia(2, -2);
    }

    @Test
    public void testPotenciaCasoDeFronteira() {
        Assert.assertEquals(1, Potencia.potencia(1, 0), 0.0);
    }

    @Test
    public void testPotenciaCasosTriviais() throws Exception {
        Assert.assertEquals(1, Potencia.potencia(1, 2), 0.0);
        Assert.assertEquals(1, Potencia.potencia(2, 0), 0.0);
        Assert.assertEquals(2, Potencia.potencia(2, 1), 0.0);
        Assert.assertEquals(4, Potencia.potencia(2, 2), 0.0);
    }

    @Test
    public void testPotenciaCasosNaoTriviais() throws Exception {
        Assert.assertEquals(25, Potencia.potencia(5, 2), 0.0);
        Assert.assertEquals(2187, Potencia.potencia(3, 7), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaSomaBaseInvalida() {
        Potencia.potenciaSoma(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPotenciaSomaExpoenteInvalido() {
        Potencia.potenciaSoma(2, -2);
    }

    @Test
    public void testPotenciaSomaCasoDeFronteira() {
        Assert.assertEquals(1, Potencia.potenciaSoma(1, 0), 0.0);
    }

    @Test
    public void testPotenciaSomaCasosTriviais() {
        Assert.assertEquals(1, Potencia.potenciaSoma(1, 2), 0.0);
        Assert.assertEquals(1, Potencia.potenciaSoma(2, 0), 0.0);
        Assert.assertEquals(2, Potencia.potenciaSoma(2, 1), 0.0);
        Assert.assertEquals(4, Potencia.potenciaSoma(2, 2), 0.0);
    }

    @Test
    public void testPotenciaSomaCasosNaoTriviais() {
        Assert.assertEquals(25, Potencia.potenciaSoma(5, 2), 0.0);
        Assert.assertEquals(2187, Potencia.potenciaSoma(3, 7), 0.0);
    }
}
