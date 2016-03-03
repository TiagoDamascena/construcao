package br.ufg.inf.es.construcao.equacao;

import org.junit.Test;
import org.junit.Assert;

public class EquacaoTest {

    @Test
    public void testSolucoesEquacao() {
        Assert.assertEquals(6489, Equacao.equacao());
    }
}
