package br.com.bytebank.collections.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArrayList {
    public static void main(String[] args) {
        String aula1 = "Matematica";
        String aula2 = "Ingles";
        String aula3 = "Geografia";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        for (String aula: aulas) {
            System.out.println(aula);
        }
        System.out.println("-------------------");
        Collections.sort(aulas);

        aulas.remove(2);
        aulas.forEach(System.out::println);
        aulas.add("Array");
        aulas.sort(String::compareTo);

        System.out.println("-------------------");
        aulas.forEach(System.out::println);

    }
}
