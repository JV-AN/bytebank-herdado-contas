package br.com.bytebank.collections.teste;

import br.com.bytebank.collections.modelo.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteAula {
    public static void main(String[] args) {
        ArrayList<Aula> aulas = new ArrayList<>();
        Aula aula1 = new Aula("Matematica",15);
        aulas.add(aula1);

        Aula aula2 = new Aula("Ciencia",20);
        aulas.add(aula2);

        Aula aula3 = new Aula("Ingles",18);
        aulas.add(aula3);

        Collections.sort(aulas);
        // Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.forEach(System.out::println);

        System.out.println("-----------------");

        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.forEach(System.out::println);


    }
}
