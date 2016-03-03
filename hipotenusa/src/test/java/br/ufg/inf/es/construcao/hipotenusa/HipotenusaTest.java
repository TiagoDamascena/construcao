package br.ufg.inf.es.construcao.hipotenusa;

import org.junit.Test;
import org.junit.Assert;

public class HipotenusaTest {

    @Test
    public void testCasosTriviaisHipotenusa() {
        Assert.assertEquals(5, Hipotenusa.hipotenusa(3, 4), 0.0);
        Assert.assertEquals(10, Hipotenusa.hipotenusa(8, 6), 0.0);
        Assert.assertEquals(13, Hipotenusa.hipotenusa(5, 12), 0.0);
    }
}
