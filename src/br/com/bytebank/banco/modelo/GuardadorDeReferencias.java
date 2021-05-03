package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
    private Object[] referencias;
    private int posicao = 0;

    public GuardadorDeReferencias(){
        this.referencias = new Object[10];
    }

    public void adiciona(Object ref){
        this.referencias[this.posicao] = ref;
        this.posicao++;
    }

    public int PosicoesUsadas() {
        return this.posicao;
    }

    public Object getReferencia(int i) {
        return this.referencias[i];
    }
}
