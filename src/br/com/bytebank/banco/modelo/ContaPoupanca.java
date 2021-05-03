package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia, int numero){
        super(agencia,numero);
    }

    @Override
    public void saca(double valor) {
            if(super.saldo < valor){
                throw new SaldoInsuficienteException("Saldo: " + super.saldo + " Valor: " + valor);
            }
            super.saldo -= valor;
        }
}
