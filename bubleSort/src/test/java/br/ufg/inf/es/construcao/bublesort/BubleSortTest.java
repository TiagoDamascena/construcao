package br.ufg.inf.es.construcao.bublesort;

import org.junit.Test;
import org.junit.Assert;

public class BubleSortTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testDivisorInvalido() {
        int[] vetor = {0, 1};
        BubleSort.bubleSort(vetor, -1);
    }

    @Test
    public void testBubleSort() {
        int[] vetor = {5, 4, 3, 2, 1, 0};
        BubleSort.bubleSort(vetor, 5);
        int[] vetorR = {0, 1, 2, 3, 4, 5};
        Assert.assertArrayEquals(vetor, vetorR);
    }
    
    @Test
    public void testBubleSort2() {
        int[] vetor = {3, 7, 9, 24, 98, 0, 71, 1};
        BubleSort.bubleSort(vetor, 7);
        int[] vetorR = {0, 1, 3, 7, 9, 24, 71, 98};
        Assert.assertArrayEquals(vetor, vetorR);
    }
}
