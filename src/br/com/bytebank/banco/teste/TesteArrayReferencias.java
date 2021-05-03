package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

                  //int[] idades = new int[5];
                Object[] referencias = new Object[5];

                ContaCorrente cc1 = new ContaCorrente(22, 11);
                referencias[0] = cc1;

                ContaPoupanca cc2 = new ContaPoupanca(22, 22);
                referencias[1] = cc2;

                Cliente cliente = new Cliente();
                referencias[2] = cliente;

                //Type cast usado para dar ctza para o compilador que vai dar tudo certo! rs
                ContaPoupanca ref = (ContaPoupanca) referencias[1];
                //System.out.println(cc2.getNumero());

                System.out.println( cc2.getNumero() );
// ----------------------------------------------------------------------------------------------------------

//        ContaCorrente[] contas = new ContaCorrente[5]; // Inicia um array com os valores padrao (null)
//        ContaCorrente contaCorrente1 = new ContaCorrente(123,321);
//        ContaCorrente contaCorrente2 = new ContaCorrente(111,222);
//        ContaCorrente ref;
//
//        contas[0] = contaCorrente1;
//        contas[1] = contaCorrente2;
//        ref = contas[1]; // Referencia a mesma contaa que o array (contas[1]).
//        // tres referencias para o mesmo objeto contaCorrente1, contas[1], ref
//
//        System.out.println(contas[0]);
//        System.out.println(contas[1]);
//        System.out.println(ref);
//        System.out.println(contas); // o ID da onde esta alocado na memoria
//        System.out.println(contas[3]); //null
    }
}
