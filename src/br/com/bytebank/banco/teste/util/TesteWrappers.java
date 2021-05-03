package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
    public static void main(String[] args) {
        //Wrappers
        //int idade = 29; // primitivo, int tipo primitivo == Integer é uma classe do tipo Objeto

        Integer idadeRef = 15;//Classe refente ao tipo primitivo int, os outros tipos primitivos tbm possuem

        List<Integer> numeros= new ArrayList<Integer>(); // List só armazenam referencias
        numeros.add(29); //Auto-boxing, cria um objeto para o tipo primitivo.
        System.out.println(idadeRef.intValue());//unboxing

        Number num = 41f; //Referencia todos os tipos que sao numeros
    }
}
