package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaldoInsuficiente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123,321);
        cc.deposita(200.0);
        cc.saca(21.0);

        System.out.println(cc.getSaldo());
    }
}
