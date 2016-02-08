package br.ufg.inf.es.construcao.inverte;

/**
 * 
 */
public class Inverte {
    
    public static String inverte(String s) {
        if(s.length() == 1) {
            return s;
        } else {
            String lc = s.substring(s.length()-1);
            String s1 = s.substring(0,s.length()-1);
            return lc + inverte(s1);
        }
    }
}
