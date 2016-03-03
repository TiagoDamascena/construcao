package br.ufg.inf.es.construcao.somanaturais;

import org.junit.Test;
import org.junit.Assert;

public class SomaNaturaisTest {

    @Test
    public void testSomaNatraisTriviais() {
        Assert.assertEquals(3, SomaNaturais.somaNatrais(2));
        Assert.assertEquals(10, SomaNaturais.somaNatrais(4));
    }

    @Test
    public void testSomaNatraisNaoTriviais() {
        Assert.assertEquals(55, SomaNaturais.somaNatrais(10));
        Assert.assertEquals(120, SomaNaturais.somaNatrais(15));
    }

}
