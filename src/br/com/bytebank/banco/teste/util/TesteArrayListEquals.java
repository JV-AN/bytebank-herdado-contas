package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta contaCorrente = new ContaCorrente(101,202);
        lista.add(contaCorrente);

        Conta contaCorrente2 = new ContaCorrente(111,222);
        lista.add(contaCorrente2);

        Conta contaCorrente3 = new ContaCorrente(111,222);
        lista.add(contaCorrente3);

        boolean existe = lista.contains(contaCorrente);

        for (Conta conta:  lista) {
            System.out.println(lista.contains(conta));
        }

        System.out.println(existe);



    }
}
