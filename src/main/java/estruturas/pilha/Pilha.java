package estruturas.pilha;

import estruturas.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhar(T elemento) {
        super.adicionar(elemento);
    }

    public T espiarTopo() {
        if (estaVazia()) return null;

        return elementos[tamanho - 1];
    }

    public T desempilhar(){
        if (estaVazia()) return null;

        return elementos[--tamanho];
    }
}
