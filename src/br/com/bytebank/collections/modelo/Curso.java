package br.com.bytebank.collections.modelo;

import br.com.bytebank.collections.modelo.Aula;

import java.util.*;

public class Curso {
    private final String curso;
    private final String instrutor;
    private final List<Aula> aulas = new LinkedList<>();

    public Curso(String curso, String instrutor) {
        this.curso = curso;
        this.instrutor = instrutor;
    }

    public String getCurso() {
        return curso;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "curso='" + curso + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }

    //    public void ordena(){
//        this.aulas.sort(Comparator.comparing(Aula::getTempo));
//    }
}