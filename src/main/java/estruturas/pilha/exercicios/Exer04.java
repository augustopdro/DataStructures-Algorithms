package estruturas.pilha.exercicios;

import estruturas.pilha.Pilha;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {

        Stack<Livro> pilha = new Stack<>();

        Livro livro1 = new Livro();
        livro1.setNome("Ham on Rye: A Novel");
        livro1.setAutor("Charles Bukowski");
        livro1.setAnoLancamento(2014);
        livro1.setIsbn("006117758X");

        Livro livro2 = new Livro();
        livro2.setNome("The Brothers Karamazov");
        livro2.setAutor("Fyodor Dostoevsky");
        livro2.setAnoLancamento(1880);
        livro2.setIsbn("1250788455");

        Livro livro3 = new Livro();
        livro3.setNome("Mastering Ext JS - Second Edition");
        livro3.setAutor("Loiane Groner");
        livro3.setAnoLancamento(2015);
        livro3.setIsbn("B00U01QQWU");

        Livro livro4 = new Livro();
        livro4.setNome("JavaScript Regular Expressions");
        livro4.setAutor("Loiane Groner");
        livro4.setAnoLancamento(2015);
        livro4.setIsbn("B00YHBVHGO");

        System.out.println("Pilha de livros criada, pilha está vazia? "+ pilha.isEmpty());

        System.out.println("Empilhando livros na pilha:");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size() + " livros foram empilhados:");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? "+ pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando livros da pilha:");

        while (!pilha.isEmpty()){
            System.out.println("Desempilhando livro: " + pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhandos, pilha vazia: " + pilha.pop());
    }
}
