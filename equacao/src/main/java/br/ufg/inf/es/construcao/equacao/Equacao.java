package br.ufg.inf.es.construcao.equacao;

/**
 * Equações
 */
public class Equacao {

    /**
     * Calcula o numero de soluções de uma determinada equação
     *
     * @return número de soluçõess
     */
    public static int equacao() {
        int solucoes = 0;
        int x = 1;

        while (x <= 96) {
            int y = 1;
            while (y <= 65) {
                int z = 1;
                while (z <= 39) {
                    int w = 1;
                    while (w <= 28) {
                        if (2 * x + 3 * y + 5 * z + 7 * w == 210) {
                            solucoes++;
                        }
                        w++;
                    }
                    z++;
                }
                y++;
            }
            x++;
        }
        return solucoes;
    }
}
