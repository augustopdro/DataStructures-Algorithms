package estruturas.vetor;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return tamanho;
    }

    private void aumentaCapacidade(){
        if(tamanho == elementos.length){
            String[] elementosNovos = new String[elementos.length * 2];
            for(int i=0; i<tamanho; i++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

/*    public void adicionar(String elemento){
        for (int i=0; i<elementos.length; i++){
            if (elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    }*/

/*    public void adicionar(String elemento) throws Exception {
        if(tamanho< elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
        } else {
            throw new Exception("Vetor cheio.");
        }
    }*/

    public boolean adicionar(String elemento) {
        aumentaCapacidade();

        if(tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void adicionar(String elemento, int indice){
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

    public String buscar(int indice){
        if(!(indice >=0 && indice < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return elementos[indice];
    }

    public int buscar(String elemento){
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
