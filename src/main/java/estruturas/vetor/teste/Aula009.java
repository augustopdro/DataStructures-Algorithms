package estruturas.vetor.teste;

import estruturas.vetor.Vetor;

public class Aula009 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("b");
        vetor.adicionar("g");
        vetor.adicionar("d");
        vetor.adicionar("e");
        vetor.adicionar("f");

        System.out.println(vetor);
        vetor.remover(1);
        System.out.println(vetor);

    }
}
