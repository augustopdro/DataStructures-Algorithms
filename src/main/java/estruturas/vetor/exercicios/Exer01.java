package estruturas.vetor.exercicios;

import estruturas.vetor.Lista;

import java.util.List;

public class Exer01 {
    public static void main(String[] args) {

        Lista<String> vetor = new Lista<>(10);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");

        boolean existe = vetor.contem("A");
        if (existe){
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }
    }
}
