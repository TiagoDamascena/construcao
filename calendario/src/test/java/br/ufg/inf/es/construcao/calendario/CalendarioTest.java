package br.ufg.inf.es.construcao.calendario;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class CalendarioTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDiaInvalido() {
        Calendario.diaDaSemana(-1, 8, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMesInvalido() {
        Calendario.diaDaSemana(1, 45, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnoInvalido() {
        Calendario.diaDaSemana(1, 5, 100);
    }

    @Test
    public void testData() throws Exception {
        int dds = Calendario.diaDaSemana(27, 8, 2015);
        assertEquals(3, dds);
    }

    @Test
    public void testBissexto() throws Exception {
        int dds = Calendario.diaDaSemana(29, 2, 2016);
        assertEquals(0, dds);
    }

    @Test
    public void testDiaJaneiro() throws Exception {
        int dds = Calendario.diaDaSemana(2, 1, 2015);
        assertEquals(4, dds);
    }

    @Test
    public void testOutraDataConhecida() throws Exception {
        int dds = Calendario.diaDaSemana(3, 1, 2015);
        assertEquals(5, dds);
    }
}
