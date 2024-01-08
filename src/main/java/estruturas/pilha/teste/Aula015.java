package estruturas.pilha.teste;

import estruturas.pilha.Pilha;

public class Aula015 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        System.out.println(pilha.estaVazia());

        pilha.empilhar(1);
        System.out.println(pilha.estaVazia());
    }
}
