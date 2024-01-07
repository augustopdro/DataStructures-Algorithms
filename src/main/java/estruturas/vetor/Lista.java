package estruturas.vetor;

import java.lang.reflect.Array;

public class Lista<T>{
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return tamanho;
    }

    private void aumentaCapacidade(){
        if(tamanho == elementos.length){
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];
            for(int i=0; i<tamanho; i++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public boolean adicionar(T elemento) {
        aumentaCapacidade();

        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(T elemento, int indice){
        if(!(indice >=0 && indice < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        aumentaCapacidade();

        for (int i=tamanho-1; i>=indice; i--) {
            elementos[i + 1] = elementos[i];
        }

        elementos[indice] = elemento;
        tamanho++;
    }

    public T buscar(int indice){
        if(!(indice >=0 && indice < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return elementos[indice];
    }

    public int buscar(T elemento){
        for(int i=0; i<tamanho; i++){
            if(elemento.equals(elementos[i])){
                return i;
            }
        }
        return -1;
    }

    public T obtem(int indice){
        return buscar(indice);
    }

    public boolean contem(T elemento){
        return buscar(elemento) > -1;
    }

    public int ultimoIndice(T elemento){
        for(int i=tamanho-1; i>=0; i--){
            if(elemento.equals(elementos[i])){
                return i;
            }
        }
        return -1;
    }

    public void remove(T elemento){
        int indice = buscar(elemento);

        if (indice > -1) {
            remover(indice);
        }
    }

    public void remover(int indice){
        if(!(indice >=0 && indice < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        for(int i=indice; i<tamanho-1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    public void limpar(){
        /*for (int i=0; i<this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;*/
        this.elementos = (T[]) new Object[this.elementos.length];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i<tamanho-1; i++){
            s.append(elementos[i]);
            s.append(", ");
        }

        s.append(elementos[tamanho-1]);
        s.append("]");

        return s.toString();
    }
}
