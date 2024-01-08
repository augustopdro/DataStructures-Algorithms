package estruturas.pilha.exercicios;

import estruturas.pilha.Pilha;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);
        Integer number;

        for (int i=1; i<=10; i++){
            System.out.print("Digite um número: ");
            number = scan.nextInt();

            if (number%2 == 0){
                pilha.empilhar(number);
            } else {
                if (pilha.estaVazia()) System.out.println("Pilha está vazia.");
                pilha.desempilhar();
            }
        }

        while (!pilha.estaVazia()){
            System.out.println("Desempilhando: " + pilha.desempilhar());
        }

        System.out.println(pilha);
    }
}
