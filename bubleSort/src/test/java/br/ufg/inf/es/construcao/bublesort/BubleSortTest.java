package br.ufg.inf.es.construcao.bublesort;

import org.junit.Test;
import org.junit.Assert;

public class BubleSortTest {

    @Test
    public void testBubleSort() {
        int[] vetor = {3, 7, 9, 24, 98, 0, 71, 1};
        BubleSort.bubleSort(vetor);
        int[] vetorEsperado = {0, 1, 3, 7, 9, 24, 71, 98};
        Assert.assertArrayEquals(vetor, vetorEsperado);
    }

    @Test
    public void testBubleSortVetorInvertido() {
        int[] vetor = {5, 4, 3, 2, 1, 0};
        BubleSort.bubleSort(vetor);
        int[] vetorEspoerado = {0, 1, 2, 3, 4, 5};
        Assert.assertArrayEquals(vetor, vetorEspoerado);
    }

    @Test
    public void testBubleSortVetorOrdenado() {
        int[] vetor = {0, 2, 4, 6, 8, 10};
        BubleSort.bubleSort(vetor);
        int[] vetorEspoerado = {0, 2, 4, 6, 8, 10};
        Assert.assertArrayEquals(vetor, vetorEspoerado);
    }

    @Test
    public void testBubleSortVetorSemiOrdenado() {
        int[] vetor = {10, 11, 12, 13, 15, 14};
        BubleSort.bubleSort(vetor);
        int[] vetorEspoerado = {10, 11, 12, 13, 14, 15};
        Assert.assertArrayEquals(vetor, vetorEspoerado);
    }

    @Test
    public void testBubleSortVetorIguais() {
        int[] vetor = {7, 7, 7, 7, 7, 2};
        BubleSort.bubleSort(vetor);
        int[] vetorEspoerado = {2, 7, 7, 7, 7, 7};
        Assert.assertArrayEquals(vetor, vetorEspoerado);
    }
}
