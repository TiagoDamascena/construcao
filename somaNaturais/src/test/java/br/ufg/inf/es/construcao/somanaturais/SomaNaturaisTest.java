package br.ufg.inf.es.construcao.somanaturais;

import org.junit.Test;
import org.junit.Assert;

public class SomaNaturaisTest {

    @Test
    public void testSomaNatrais() {
        Assert.assertEquals(55, SomaNaturais.somaNatrais(10));
        Assert.assertEquals(120, SomaNaturais.somaNatrais(15));
    }
    
}
