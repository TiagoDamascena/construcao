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

    @Test
    public void testImprimeUmArray() {
        int[] vetor = {0, 1, 2, 3};
        ImprimeArray.imprimeArray(vetor);
        Assert.assertEquals("0123", outContent.toString());
    }

    @Test
    public void testImprimeOutroArray() {
        int[] vetor = {7, 9, 12, 17, 0, 8};
        ImprimeArray.imprimeArray(vetor);
        Assert.assertEquals("79121708", outContent.toString());
    }
}
