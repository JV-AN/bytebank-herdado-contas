package br.com.bytebank.banco.teste;

import java.util.Locale;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Alura"; // Imutavel
        String outro = nome.replace("a","x");
        System.out.println(outro);

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();
        System.out.println(texto);

        //public class StringBuilder implements CharSequence
        //CharSequence cs = new StringBuilder("também é uma sequencia de caracteres");
        // CharSequence seq = "é uma sequencia de caracteres"; isso e RARO

        //.replace = troca as String/substring/char de lugar
        //.upperCase = Caixa alta na String/char
        //.lowerCase = Caixa baixa na String/char
        //.indexof = posicao da String/substring/char na string (retorna int)
        //.chartAt = retorna o char da posicao desejada em uma String
        //.length = retorna o tamanho da String
        //.isEmpty = verifica se a variavel String esta vazia
        //.trim = remove os espacos de uma String.
        //.contains = verifica se contem uma String/substring especifica na String
    }
}
