package br.ufg.inf.es.construcao.mediaarray;

import org.junit.Test;
import org.junit.Assert;

public class MediaArrayTest {

    @Test
    public void testAlgumasMediasArray() {
        int[] vetor = {1, 3, 5, 7, 9};
        Assert.assertEquals(5, MediaArray.mediaArray(vetor));

        int[] vetor2 = {12, 7, 1, 0, 5, 9, 11, 19};
        Assert.assertEquals(8, MediaArray.mediaArray(vetor2));
    }

    @Test
    public void testMediaIguaisArray() {
        int[] vetor = {6, 6, 6, 6, 6, 6, 6};
        Assert.assertEquals(6, MediaArray.mediaArray(vetor));

        int[] vetor2 = {9, 9, 9, 9, 9, 9, 9, 9, 9};
        Assert.assertEquals(9, MediaArray.mediaArray(vetor2));
    }
}
