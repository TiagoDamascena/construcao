package br.ufg.inf.es.construcao.fatorial;

import org.junit.Assert;
import org.junit.Test;

public class FatorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoFatorial() {
        Fatorial.fatorial(-1);
    }

    @Test
    public void testNumerosTriviaisFatorial() {
        Assert.assertEquals(1, Fatorial.fatorial(1));
        Assert.assertEquals(2, Fatorial.fatorial(2));
        Assert.assertEquals(6, Fatorial.fatorial(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoFatorialSoma() {
        Fatorial.fatorialSoma(-1);
    }

    @Test
    public void testNumerosTriviaisFatorialSoma() {
        Assert.assertEquals(1, Fatorial.fatorialSoma(1));
        Assert.assertEquals(2, Fatorial.fatorialSoma(2));
        Assert.assertEquals(6, Fatorial.fatorialSoma(3));
    }

    //Testes AtendeSomaFatorialDigitos
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoAtendeSomaFatoriais() {
        Fatorial.atendeSomaFatorialDigitos(-1);
    }

    @Test
    public void testAtendeSomaFatorialDigitos() {
        Assert.assertTrue(Fatorial.atendeSomaFatorialDigitos(145));
    }
}
