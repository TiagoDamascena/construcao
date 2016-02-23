package br.ufg.inf.es.construcao.mediaarray;

import org.junit.Test;
import org.junit.Assert;

public class MediaArrayTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalido() {
        int[] vetor = {0, 1};
        MediaArray.mediaArray(vetor, -1);
    }

    @Test
    public void testMediaArray() {
        int[] vetor = {1, 3, 5, 7, 9};
        Assert.assertEquals(4, MediaArray.mediaArray(vetor, 4));
        
        int[] vetor2 = {12, 7, 1, 0, 5, 9, 11, 19};
        Assert.assertEquals(5, MediaArray.mediaArray(vetor2, 5));
    }
    
}
