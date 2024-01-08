package estruturas.pilha.teste;

import estruturas.pilha.Pilha;

public class Aula016 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        System.out.println(pilha.espiarTopo());
    }
}
