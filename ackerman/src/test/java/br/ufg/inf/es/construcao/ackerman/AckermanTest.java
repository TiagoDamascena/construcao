package br.ufg.inf.es.construcao.ackerman;

import org.junit.Test;
import org.junit.Assert;

public class AckermanTest {
    @Test
    public void testAckerman() {
        Assert.assertEquals(1, Ackerman.ackerman(0, 0));
        Assert.assertEquals(9, Ackerman.ackerman(2, 3));
        Assert.assertEquals(61, Ackerman.ackerman(3, 3));
        Assert.assertEquals(125, Ackerman.ackerman(3, 4));
    }
    
}
