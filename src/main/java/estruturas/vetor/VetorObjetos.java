package estruturas.vetor;

public class VetorObjetos {
    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return tamanho;
    }

    private void aumentaCapacidade(){
        if(tamanho == elementos.length){
            Object[] elementosNovos = new Object[elementos.length * 2];
            for(int i=0; i<tamanho; i++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public boolean adicionar(Object elemento) {
        aumentaCapacidade();

        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(Object elemento, int indice){
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

    public Object buscar(int indice){
        if(!(indice >=0 && indice < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return elementos[indice];
    }

    public int buscar(Object elemento){
        for(int i=0; i<tamanho; i++){
            if(elemento.equals(elementos[i])){
                return i;
            }
        }
        return -1;
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
