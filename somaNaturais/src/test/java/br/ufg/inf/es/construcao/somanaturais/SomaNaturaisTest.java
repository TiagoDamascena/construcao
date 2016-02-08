/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcao.somanaturais;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author tiago
 */
public class SomaNaturaisTest {

    @Test
    public void testSomaNatrais() {
        Assert.assertEquals(55, SomaNaturais.somaNatrais(10));
        Assert.assertEquals(120, SomaNaturais.somaNatrais(15));
    }
    
}
