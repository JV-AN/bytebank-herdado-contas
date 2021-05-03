package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) {
        if(super.saldo < valor){
           throw new SaldoInsuficienteException("Saldo: " + super.saldo + " Valor: " + valor);
        }
        super.saldo -= valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "Conta Corrente" + super.toString();
    }
}