package br.com.aum.atividade3;

public class Pilha {
    private Integer array[];
    private int topo;
    private static final int TAMANHO_PADRAO = 5;

    public Pilha() {
        limpar();
    }

    public void limpar() {
        array = new Integer[TAMANHO_PADRAO];
        topo = -1;
    }

    public int tamanho() {
        return (topo + 1);
    }

    public void push(Integer numero) {
        topo++;
        if (topo == array.length) {
            dupliqueArray();
        }
        array[topo] = numero;
    }

    public void dupliqueArray() {
        Integer newArray[] = new Integer[2 * array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public Integer top() {
        if (topo >= 0) {
            return array[topo];
        } else {
            return null;
        }
    }

    public Integer pop() {
        if (topo >=0) {
            return array [topo --];
        } else {
            return null;           
        }
    }
}
