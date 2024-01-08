package estruturas.pilha.teste;


import java.util.Stack;

public class Aula018 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("Is empty: " + stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack);
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());

        stack.pop();
        System.out.println("Stack: " + stack);
        System.out.println("Top: " + stack.peek());
    }
}
