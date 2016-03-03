package br.ufg.inf.es.construcao.divide;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class DivideTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisorInvalidoDivide() {
        Divide.divide(0, 1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividendoInvalidoDivide() {
        Divide.divide(1, 0, 1);
    }

    @Test
    public void testCasoTrivial1Divide() {
        Divide.divide(5, 2, 1);
        Assert.assertEquals("2,5", outContent.toString());
    }

    @Test
    public void testCasoTrivial2Divide() {
        Divide.divide(6, 2, 0);
        Assert.assertEquals("3", outContent.toString());
    }

    @Test
    public void testCasoNaoTrivial1Divide() {
        Divide.divide(10, 3, 4);
        Assert.assertEquals("3,3333", outContent.toString());
    }

    @Test
    public void testCasoNaoTrivial2Divide() {
        Divide.divide(25, 3, 3);
        Assert.assertEquals("8,333", outContent.toString());
    }

}
