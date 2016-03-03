package br.ufg.inf.es.construcao.calendario;

/**
 * Servi�os oferecidos para manipula��o de informa��es de calend�rio.
 */
public class Calendario {

    /**
     * Obt�m o dia da semana de uma dada data.
     *
     * @param dia O dia da data.
     * @param mes O m�s da data.
     * @param ano O ano da data.
     * @return O valor 0 para segunda-feira, 1 para ter�a-feira e assim
     * sucessivamente.
     * @throws IllegalArgumentException Caso o dia, o m�s ou o ano fornecidos
     * n�o estejam na faixa admitida. O dia deve ser um valor de 1 a 31,
     * inclusive. O m�s deve ser um valor de 1 a 12, inclusive. O ano deve ser
     * um valor maior que 1752.
     */
    public static int diaDaSemana(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inv�lido");
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("M�s inv�lido");
        }

        if (ano < 1753) {
            throw new IllegalArgumentException("Ano inv�lido");
        }

        if (mes == 1 || mes == 2) {
            mes = mes + 12;
            ano = ano - 1;
        }

        int diaDaSemana = dia + 2 * mes + (3 * (mes + 1) / 5) + ano + ano / 4 - ano / 100 + ano / 400;

        return diaDaSemana % 7;
    }
}
