package estruturas.pilha.teste;

import estruturas.pilha.Pilha;

public class Aula014 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        for(int i=1; i<=10; i++){
            pilha.empilhar(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
