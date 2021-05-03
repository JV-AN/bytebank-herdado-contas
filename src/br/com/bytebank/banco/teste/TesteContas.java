package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123,321);
        cc.deposita(250.0);

        ContaPoupanca cp = new ContaPoupanca(321,123);
        cp.deposita(200.0);

        cc.transfere(150.0, cp);
        cc.saca(20.0);
        cp.saca(150.0);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
