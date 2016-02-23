package br.ufg.inf.es.construcao.inverte;

/**
 * Inverte os caracteres de uma string
 */
public class Inverte {
    
    /**
     * Inverte os caracteres de uma dada string
     * @param palavra string a ser invertida
     * @return String invertida
     */
    public static String inverte(String palavra) {
        if(palavra.length() == 1) {
            return palavra;
        } else {
            String ultimoChar = palavra.substring(palavra.length()-1);
            String restoString = palavra.substring(0,palavra.length()-1);
            return ultimoChar + inverte(restoString);
        }
    }
}
