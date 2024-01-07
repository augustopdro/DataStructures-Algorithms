package estruturas.vetor.exercicios;

import estruturas.vetor.Lista;

public class Exer02 {
    public static void main(String[] args) {

        Lista<String> vetor = new Lista<>(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("G");
        vetor.adicionar("D");
        vetor.adicionar("F");

        int pos = vetor.ultimoIndice("A");

        if (pos > -1){
            System.out.println("Elemento existe no array na pos " + pos);
        } else {
            System.out.println("Elemento não existe no array " + pos);
        }

    }
}
