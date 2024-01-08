package estruturas.pilha.exercicios;

import estruturas.pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {

        Pilha<Livro> pilha = new Pilha<Livro>(20);

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

        System.out.println("Pilha de livros criada, pilha está vazia? "+ pilha.estaVazia());

        System.out.println("Empilhando livros na pilha:");

        pilha.empilhar(livro1);
        pilha.empilhar(livro2);
        pilha.empilhar(livro3);
        pilha.empilhar(livro4);

        System.out.println(pilha.tamanho() + " livros foram empilhados:");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? "+ pilha.estaVazia());

        System.out.println("Espiando o topo da pilha: " + pilha.espiarTopo());

        System.out.println("Desempilhando livros da pilha:");

        while (!pilha.estaVazia()){
            System.out.println("Desempilhando livro: " + pilha.desempilhar());
        }

        System.out.println("Todos os livros foram desempilhandos, pilha vazia: " + pilha.estaVazia());
    }
}
