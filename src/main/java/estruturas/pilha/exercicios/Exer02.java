package estruturas.pilha.exercicios;

import estruturas.pilha.Pilha;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Pilha<Integer> pilhaPar = new Pilha<Integer>();
        Pilha<Integer> pilhaImpar = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);
        Integer number;

        for (int i=1; i<=10; i++){
            System.out.print("Digite um número: ");
            number = scan.nextInt();

            if (number == 0){
                //pilha par
                if (pilhaPar.estaVazia()) {
                    System.out.println("Pilha par está vazia.");
                }
                else {
                    System.out.println("Desempilhando da pilha par: " + pilhaPar.desempilhar());
                }

                //pilha impar
                if (pilhaImpar.estaVazia()) {
                    System.out.println("Pilha ímpar está vazia.");
                }
                else {
                    System.out.println("Desempilhando da pilha ímpar: " + pilhaImpar.desempilhar());
                }
            }
            else if (number%2 == 0){
                System.out.println("Número par, empilhando na pilha par: " + number);
                pilhaPar.empilhar(number);
            }
            else {
                System.out.println("Número ímpar, empilhando na pilha ímpar: " + number);
                pilhaImpar.empilhar(number);
            }
        }


        while (!pilhaPar.estaVazia()){
            System.out.println("Desempilhando pilha par: " + pilhaPar.desempilhar());
        }
        System.out.println("Pilha par: " + pilhaPar);

        while (!pilhaImpar.estaVazia()){
            System.out.println("Desempilhando pilha ímpar: " + pilhaImpar.desempilhar());
        }
        System.out.println("Pilha ímpar: " + pilhaImpar);
    }
}
