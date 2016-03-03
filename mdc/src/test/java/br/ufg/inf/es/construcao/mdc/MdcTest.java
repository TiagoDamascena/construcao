package br.ufg.inf.es.construcao.mdc;

import org.junit.Test;
import org.junit.Assert;

public class MdcTest {

    @Test(expected = IllegalArgumentException.class)
    public void testAInvalidoMdc() {
        Mdc.mdc(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBInvalidoMdc() {
        Mdc.mdc(2, -1);
    }

    @Test
    public void testCasoDeFronteiraMdc() {
        Assert.assertEquals(1, Mdc.mdc(1, 1));
    }

    @Test
    public void testCasosTriviaisMdc() throws Exception {
        Assert.assertEquals(1, Mdc.mdc(2, 1));
        Assert.assertEquals(2, Mdc.mdc(2, 2));
        Assert.assertEquals(3, Mdc.mdc(6, 3));
    }

    @Test
    public void testCasosNaoTriviaisMdc() throws Exception {
        Assert.assertEquals(4, Mdc.mdc(12, 8));
        Assert.assertEquals(3, Mdc.mdc(9, 6));
        Assert.assertEquals(6, Mdc.mdc(30, 12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAInvalidoMdc2() {
        Mdc.mdc2(1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBInvalidoMdc2() {
        Mdc.mdc2(2, -1);
    }

    @Test
    public void testCasoDeFronteiraMdc2() {
        Assert.assertEquals(1, Mdc.mdc2(1, 1));
    }

    @Test
    public void testCasosTriviaisMdc2() throws Exception {
        Assert.assertEquals(1, Mdc.mdc2(2, 1));
        Assert.assertEquals(2, Mdc.mdc2(2, 2));
        Assert.assertEquals(3, Mdc.mdc2(6, 3));
    }

    @Test
    public void testCasosNaoTriviaisMdc2() throws Exception {
        Assert.assertEquals(4, Mdc.mdc2(12, 8));
        Assert.assertEquals(3, Mdc.mdc2(9, 6));
        Assert.assertEquals(6, Mdc.mdc2(30, 12));
    }
}
