package estruturas.vetor.exercicios;

import estruturas.vetor.Lista;

public class Exer04 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);

        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.adicionar("D");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(3));
    }
}
