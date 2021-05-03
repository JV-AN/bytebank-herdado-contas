package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteObject {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(123,456);
        Cliente cliente = new Cliente();

        System.out.println(cliente);
        System.out.println(contaCorrente);
        print();
        print(cliente);
        print(contaCorrente);
    }

    static void print(){};
    static void print(Cliente cliente){};
    static void print(Object object){};

}
