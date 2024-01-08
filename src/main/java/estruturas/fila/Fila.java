package estruturas.fila;

import estruturas.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileirar(T elemento){
        this.adicionar(elemento);
    }

    public T espiar(){
        if (this.estaVazia()){
            return null;
        }

        return this.elementos[0];
    }

    public T desenfileirar(){
        final int POSICAO = 0;

        if (this.estaVazia()){
            return null;
        }

        T elementoASerRemovido = this.elementos[POSICAO];

        this.remover(POSICAO);

        return elementoASerRemovido;

    }
}
