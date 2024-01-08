package estruturas.pilha.exercicios;

import estruturas.pilha.Pilha;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {

        Pilha<Character> stack = new Pilha<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Please, write a String: ");
        String s = scan.next();
        String sInverted = "";

        System.out.println(s);

        for(int i=0; i<s.length(); i++){
            stack.empilhar(s.charAt(i));
        }

        while (!stack.estaVazia()){
            sInverted += stack.desempilhar();
        }
        System.out.println(s);
        System.out.println(sInverted);

        if (s.equals(sInverted)){
            System.out.println("É um palíndromo");
        }
        else {
            System.out.println("Não é um palíndromo");
        }
    }
}
