package br.com.aum.atividade3;

import java.util.ArrayList;
import java.util.List;

public class Atividade3 {
    public static void main(String[] args) {
        // passo 1
        List<Integer> lista = new ArrayList<>(5);
        for (int i = 1; i < 6; i++) {
            lista.add(i);
        }

        // passo 2
        Pilha pilha = new Pilha();
        for (int i = 0; i < lista.size(); i++) {
            Integer numero = lista.get(i);
            pilha.push(numero);
        }
        lista.clear();

        // passo 3
        Fila fila = new Fila();
        int tamanhoPilha = pilha.tamanho();
        for (int i = 0; i < tamanhoPilha; i++) {
            Integer numero = pilha.pop();
            fila.enqueue(numero);
        }
        pilha.limpar();

        // passo 4
        for (int i = 6; i < 11; i++) {
            lista.add(i);
        }

        // passo 5
        for (int i = 0; i < lista.size(); i++) {
            Integer numero = lista.get(i);
            pilha.push(numero);
        }
        lista.clear();

        tamanhoPilha = pilha.tamanho();
        for (int i = 0; i < tamanhoPilha; i++) {
            Integer numero = pilha.pop();
            fila.enqueue(numero);
        }
        pilha.limpar();

        // passo 6
        fila.imprimir();
    }
}
