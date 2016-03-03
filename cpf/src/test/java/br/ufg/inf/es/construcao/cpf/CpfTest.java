package br.ufg.inf.es.construcao.cpf;

import org.junit.Test;
import org.junit.Assert;

public class CpfTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalidoCpf() {
        int[] vetor = new int[13];
        Cpf.cpf(vetor);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroDigitoInvalidoCpf() {
        int[] vetor = new int[13];
        vetor[0] = 1;
        Cpf.cpf(vetor);
    }

    @Test
    public void testCpfValido() {
        int[] vetor = {0, 6, 4, 8, 3, 7, 8, 7, 6, 8, 5, 4};
        Assert.assertTrue(Cpf.cpf(vetor));

        int[] vetor2 = {0, 7, 6, 6, 0, 1, 5, 5, 2, 0, 2, 0};
        Assert.assertTrue(Cpf.cpf(vetor2));
    }

    @Test
    public void testCpfInvalido() {
        int[] vetor2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2};
        Assert.assertFalse(Cpf.cpf(vetor2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoInvalidoCpf2() {
        int[] vetor = new int[13];
        Cpf.cpf2(vetor);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroDigitoInvalidoCpf2() {
        int[] vetor = new int[13];
        vetor[0] = 1;
        Cpf.cpf2(vetor);
    }

    @Test
    public void testCpf2Valido() {
        int[] vetor = {0, 6, 4, 8, 3, 7, 8, 7, 6, 8, 5, 4};
        Assert.assertTrue(Cpf.cpf2(vetor));

        int[] vetor2 = {0, 7, 6, 6, 0, 1, 5, 5, 2, 0, 2, 0};
        Assert.assertTrue(Cpf.cpf2(vetor2));
    }

    @Test
    public void testCpf2Invalido() {
        int[] vetor2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2};
        Assert.assertFalse(Cpf.cpf2(vetor2));
    }
}
