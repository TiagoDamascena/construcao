package br.ufg.inf.es.construcao.imprimearray;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class ImprimeArrayTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    
    
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalido() {
        int[] vetor = {0, 1};
        ImprimeArray.imprimeArray(vetor, -1);
    }
    
    @Test
    public void testImprimeArray() {
        int[] vetor = {0, 1, 2, 3};
        ImprimeArray.imprimeArray(vetor, 4);
        Assert.assertEquals("0123", outContent.toString());
    }
    
    @Test
    public void testImprimeArray2() {
        int[] vetor = {7, 9, 12, 17, 0, 8};
        ImprimeArray.imprimeArray(vetor, 5);
        Assert.assertEquals("7912170", outContent.toString());
    }
}
