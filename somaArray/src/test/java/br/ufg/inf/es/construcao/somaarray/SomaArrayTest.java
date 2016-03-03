package br.ufg.inf.es.construcao.somaarray;

import org.junit.Test;
import org.junit.Assert;

public class SomaArrayTest {

    @Test
    public void testSomaAlgunsArray() {
        int[] vetor = {1, 3, 5, 7, 9};
        Assert.assertEquals(25, SomaArray.somaArray(vetor));

        int[] vetor2 = {12, 7, 1, 0, 6, 9, 11, 19};
        Assert.assertEquals(65, SomaArray.somaArray(vetor2));
    }

}
