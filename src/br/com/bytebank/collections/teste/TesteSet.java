package br.com.bytebank.collections.teste;

import java.util.*;

public class TesteSet {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Herick");
        alunos.add("Daniel");
        alunos.add("Humberto");
        alunos.add("João");

        System.out.println(alunos.size());
        alunos.add("Humberto");
        System.out.println(alunos.size());

        boolean herickEstaMatriculado = alunos.contains("Herick");
        System.out.println(alunos);
        System.out.println(herickEstaMatriculado);
        alunos.remove("Daniel");
        alunos.forEach(System.out::println);
        System.out.println("---------------");

        List<String> alunosLista = new ArrayList<>(alunos);
        alunosLista.sort(String::compareTo);
        alunosLista.forEach(System.out::println);

    }
}
