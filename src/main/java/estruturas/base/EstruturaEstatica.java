package estruturas.base;

public class EstruturaEstatica<T> {
    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
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

    public boolean estaVazia(){
        return tamanho == 0;
    }

    protected boolean adicionar(T elemento) {
        aumentaCapacidade();

        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    protected void adicionar(T elemento, int indice){
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

    protected void remover(int indice){
        if(!(indice >=0 && indice < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        for(int i=indice; i<tamanho-1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i<tamanho-1; i++){
            s.append(elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0) {
            s.append(elementos[tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
