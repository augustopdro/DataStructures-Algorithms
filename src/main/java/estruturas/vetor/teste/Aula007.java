package estruturas.vetor.teste;

import estruturas.vetor.Vetor;

public class Aula007 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("b");
        vetor.adicionar("c");
        vetor.adicionar("e");
        vetor.adicionar("f");
        vetor.adicionar("g");

        System.out.println(vetor);
        vetor.adicionar("a", 0);
        System.out.println(vetor);
        vetor.adicionar("d", 3);
        System.out.println(vetor);
    }
}
