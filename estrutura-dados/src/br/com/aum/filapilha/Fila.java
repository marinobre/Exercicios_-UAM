package br.com.aum.atividade3;

public class Fila {
    private Integer array[];
    private int tamanho;
    private int indiceVaiSair;
    private int indiceEntrou;
    private static final int TAMANHO_PADRAO = 10;

    public Fila() {
        array = new Integer[TAMANHO_PADRAO];
        esvazie();
    }

    public int tamanho() {
        return tamanho;
    }

    public void esvazie() {
        tamanho = 0;
        indiceVaiSair = 0;
        indiceEntrou = array.length - 1;
    }

    private int incremente(int indice) {
        indice++;
        if (indice == array.length) {
            indice = 0;
        }
        return indice;
    }

    public void enqueue(Integer x) {
        if (tamanho == array.length)
            dupliqueArray();
        indiceEntrou = incremente(indiceEntrou);
        array[indiceEntrou] = x;
        tamanho++;
    }

    private void dupliqueArray() {
        Integer novo[] = new Integer[2 * array.length];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = array[indiceVaiSair];
            indiceVaiSair = incremente(indiceVaiSair);
        }
        array = novo;
        indiceVaiSair = 0;
        indiceEntrou = tamanho - 1;
    }

    public Integer dequeue() {
        if (tamanho == 0)
            return (null);
        tamanho--;
        Integer x = array[indiceVaiSair];
        indiceVaiSair = incremente(indiceVaiSair);
        return x;
    }

    public void imprimir() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
