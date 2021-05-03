package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        List<Conta> lista = new LinkedList<Conta>(); //Vector , threadSafe usado em varias stacks

        Conta contaCorrente = new ContaCorrente(111,222);
        lista.add(contaCorrente);

        Conta contaCorrente2 = new ContaCorrente(123,222);
        lista.add(contaCorrente2);

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        int tamanho = lista.size();
        System.out.println(tamanho);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        System.out.println("___________________________________________");

        for (Conta oRef: lista) {
            System.out.println(oRef);
        }

        lista.remove(1);
        System.out.println("___________________________________________");

        for (Conta oRef: lista) {
            System.out.println(oRef);
        }
        System.out.println(tamanho);


    }
}
