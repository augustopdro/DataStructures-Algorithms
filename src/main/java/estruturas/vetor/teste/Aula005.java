package estruturas.vetor.teste;

import estruturas.vetor.Vetor;

public class Aula005 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("elemento 1");
        vetor.adicionar("elemento 2");
        vetor.adicionar("elemento 3");

        System.out.println(vetor.buscar(2));
    }
}
