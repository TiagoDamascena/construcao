package br.ufg.inf.es.construcao.ackerman;

/**
 *
 */
public class Ackerman {
    
    public static int ackerman(int x, int y) {
        if(x == 0) {
            return y + 1;
        }
        
        if(y == 0) {
            return ackerman(x-1, 1);
        }
        
        return ackerman(x-1, ackerman(x, y-1));
    }
}
