package br.ufg.inf.es.construcao.fatorial;

import org.junit.Assert;
import org.junit.Test;

public class FatorialTest {
    //Testes Fatorial
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalido() {
        Fatorial.fatorial(-1);
    }

    @Test
    public void testFatorial() {
        Assert.assertEquals(1, Fatorial.fatorial(1));
        Assert.assertEquals(2, Fatorial.fatorial(2));
        Assert.assertEquals(6, Fatorial.fatorial(3));
    }
    //Testes Fatorial Soma
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalidoSoma() {
        Fatorial.fatorialSoma(-1);
    }
    
    @Test
    public void testFatorialSoma() {
        Assert.assertEquals(1, Fatorial.fatorialSoma(1));
        Assert.assertEquals(2, Fatorial.fatorialSoma(2));
        Assert.assertEquals(6, Fatorial.fatorialSoma(3));
    }
    
    //Testes AtendeSomaFatorialDigitos
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalidoAtende() {
        Fatorial.atendeSomaFatorialDigitos(-1);
    }
    
    @Test
    public void testAtendeSomaFatorialDigitos() {
        Assert.assertTrue(Fatorial.atendeSomaFatorialDigitos(145));
    }
}
