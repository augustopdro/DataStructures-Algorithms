package estruturas.vetor.teste;

import estruturas.vetor.Vetor;

public class Aula008 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("b");
        vetor.adicionar("c");
        vetor.adicionar("e");
        vetor.adicionar("f");
        vetor.adicionar("g");

        System.out.println(vetor);
    }
}
