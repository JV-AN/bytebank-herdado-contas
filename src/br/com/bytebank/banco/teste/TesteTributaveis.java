package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc  = new ContaCorrente(123,333);
        cc.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        CalculadorImposto calc = new CalculadorImposto();

        calc.registrar(cc);
        calc.registrar(seguroDeVida);

        System.out.println(calc.getTotalImposto());
    }
}
