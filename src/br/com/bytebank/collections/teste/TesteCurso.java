package br.com.bytebank.collections.teste;

import br.com.bytebank.collections.modelo.Aula;
import br.com.bytebank.collections.modelo.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteCurso {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Java Collections","Paulo Silveira");
        javaCollections.adiciona(new Aula("LinkedList",11));
        javaCollections.adiciona(new Aula("Arraylist",15));
        javaCollections.adiciona(new Aula("Maps and Sets",13));

        //javaCollections.ordena(); NAO FAZER OQUE JA EXISTE
        List<Aula> aulasImutaveis = javaCollections.getAulas();
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);

        System.out.println(javaCollections);
        System.out.println(javaCollections.getTempoTotal());

    }
}
