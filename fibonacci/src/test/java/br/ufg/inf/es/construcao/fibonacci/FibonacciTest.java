package br.ufg.inf.es.construcao.fibonacci;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testNumeroInvalido() {
        Fibonacci.fibonacci(-1);
    }

    @Test
    public void testFibonacci() {
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(55, Fibonacci.fibonacci(10));
    }
    
}
