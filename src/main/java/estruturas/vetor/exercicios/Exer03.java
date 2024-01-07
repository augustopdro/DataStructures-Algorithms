package estruturas.vetor.exercicios;

import estruturas.vetor.Lista;

public class Exer03 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");
        lista.adicionar("E");
        System.out.println(lista);

        lista.remove("A");
        System.out.println(lista);

        lista.remove("B");
        System.out.println(lista);
    }
}
