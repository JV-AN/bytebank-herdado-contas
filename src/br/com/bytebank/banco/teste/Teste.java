package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class Teste {
    public static void main(String[] args) {
        GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();

        Conta contaCorrente = new ContaCorrente(111,222);
        guardadorDeReferencias.adiciona(contaCorrente);

        Cliente cliente = new Cliente();
        guardadorDeReferencias.adiciona(cliente);

        int tamanho = guardadorDeReferencias.PosicoesUsadas();
        System.out.println(tamanho);

        Conta ref = (Conta) guardadorDeReferencias.getReferencia(0);
        System.out.println(ref.getNumero());
    }

}
