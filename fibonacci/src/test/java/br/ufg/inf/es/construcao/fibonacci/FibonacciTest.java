package br.ufg.inf.es.construcao.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoFibonacci() {
        Fibonacci.fibonacci(-1);
    }

    @Test
    public void testCasoDeFronteiraFibonacci() {
        Assert.assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testCasosTriviaisFibonacci() {
        Assert.assertEquals(1, Fibonacci.fibonacci(1));
        Assert.assertEquals(1, Fibonacci.fibonacci(2));
    }

    @Test
    public void testCasosNaoTriviaisFibonacci() {
        Assert.assertEquals(55, Fibonacci.fibonacci(10));
        Assert.assertEquals(6765, Fibonacci.fibonacci(20));
    }
}
