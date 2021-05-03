package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivo {
    public static void main(String[] args) {
        int[] idades = new int[5]; // Inicia com os valores padrao
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int idade : idades) {
            System.out.println(idade);
        }
    }
}
