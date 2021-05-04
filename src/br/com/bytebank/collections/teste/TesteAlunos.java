package br.com.bytebank.collections.teste;

import br.com.bytebank.collections.modelo.Aluno;
import br.com.bytebank.collections.modelo.Aula;
import br.com.bytebank.collections.modelo.Curso;

public class TesteAlunos {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Java Collections","Paulo Silveira");
        javaCollections.adiciona(new Aula("LinkedList",11));
        javaCollections.adiciona(new Aula("Arraylist",15));
        javaCollections.adiciona(new Aula("Maps and Sets",13));

        Aluno a1 = new Aluno("Herick",2015);
        Aluno a2= new Aluno("Joao",5478);
        Aluno a3 = new Aluno("Humberto",6659);

        javaCollections.matricula(a1);
        javaCollections.matricula(a2);
        javaCollections.matricula(a3);

        System.out.println("Lista de Alunos: ");
        javaCollections.getAlunos().forEach(System.out::println);

        System.out.println("O aluno " + a1.getNome() + " esta matricualdo?");
        System.out.println(javaCollections.estaMatriculado(a2));

        Aluno aa = new Aluno("Herick",2015);
        javaCollections.matricula(aa);
        System.out.println(a1.equals(aa));

    }
}
