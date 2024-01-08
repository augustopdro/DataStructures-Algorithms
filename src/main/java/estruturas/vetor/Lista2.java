package estruturas.vetor;

import estruturas.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(){
        super();
    }

    public Lista2(int capacidade){
        super(capacidade);
    }

    @Override
    public boolean adicionar(T elemento) {
        return super.adicionar(elemento);
    }

    @Override
    public void adicionar(T elemento, int indice) {
        super.adicionar(elemento, indice);
    }

    @Override
    public void remover(int indice) {
        super.remover(indice);
    }

}
