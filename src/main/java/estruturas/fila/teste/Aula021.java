package estruturas.fila.teste;

import estruturas.fila.Fila;

public class Aula021 {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(3);
        fila.enfileirar(1);
        fila.enfileirar(2);

        System.out.println(fila.espiar());

        System.out.println(fila);
    }
}
