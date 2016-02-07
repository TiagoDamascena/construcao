package br.ufg.inf.es.construcao.equacao;

/**
 * 
 */
public class Equacao {
    
    public static int equacao() {
        int s = 0;
        int x = 1;
        
        while(x <= 96) {
            int y = 1;
            while(y <= 65) {
                int z = 1;
                while(z <= 39) {
                    int w = 1;
                    while(w <= 28) {
                        if(2*x + 3*y + 5*z + 7*w == 210) {
                            s++;
                        }
                        w++;
                    }
                    z++;
                }
                y++;
            }
            x++;
        }
        return s;
    }
}
