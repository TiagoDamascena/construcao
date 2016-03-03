package br.ufg.inf.es.construcao.ackerman;

import org.junit.Test;
import org.junit.Assert;

public class AckermanTest {

    @Test(expected = IllegalArgumentException.class)
    public void testXInvalidoAckerman() {
        Ackerman.ackerman(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testYInvalidoAckerman() {
        Ackerman.ackerman(0, -1);
    }

    @Test
    public void testAlgunsCasosAckerman() {
        Assert.assertEquals(1, Ackerman.ackerman(0, 0));
        Assert.assertEquals(9, Ackerman.ackerman(2, 3));
        Assert.assertEquals(61, Ackerman.ackerman(3, 3));
        Assert.assertEquals(125, Ackerman.ackerman(3, 4));
    }
}
