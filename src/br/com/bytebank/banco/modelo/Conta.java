package br.com.bytebank.banco.modelo;

/**
 * @author JV-AN
 *
 * @version 0.1
 * Molde de uma conta para todos os tiipos.
 */
public abstract class Conta implements Comparable<Conta> {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    // palavra static relaciona a variavel a classe/objeto e nâo a instacia
    // tornando uma variavel "global"
    private static int total = 0;

    //construtor
    public Conta(int agencia, int numero){
        total++;
        if (agencia <= 0 && numero <= 0) {
            return;
        }
        this.agencia = agencia;
        this.numero = numero;
    }

    //methodos/ações
    public void deposita(double valor){
        this.saldo += valor;
    }

    public abstract void saca(double valor);
    /**
    * Valor tem que ser maior que o saldo disponivel
     */

    public void transfere(double valor, Conta destino){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
        }
    }

    @Override
    public int compareTo(Conta o) {
        return Double.compare(this.saldo,o.saldo);
    }

    @Override
    public boolean equals(Object ref){
        Conta outra = (Conta) ref;

        if (this.agencia != outra.getAgencia()){
            return false;
        }

        return this.numero == outra.getNumero();
    }

    @Override
    public String toString() {
        return "{" +
                "agencia=" + this.agencia +
                ", numero=" + this.numero +
                ", Saldo=" + this.saldo +'}';
    }

    //getters and setters
    public double getSaldo(){
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}
