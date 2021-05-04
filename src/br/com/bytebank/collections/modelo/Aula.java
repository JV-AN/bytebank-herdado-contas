package br.com.bytebank.collections.modelo;

public class Aula implements Comparable<Aula> {
    private final String titulo;
    private final int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }

    @Override
    public String toString() {
        return "Aula{" +
                "titulo='" + titulo + '\'' +
                ", tempo=" + tempo +
                '}';
    }
}
