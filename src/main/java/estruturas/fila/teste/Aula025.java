package estruturas.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula025 {
    public static void main(String[] args) {

        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(
                (p1, p2) -> Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade())
        );

        filaComPrioridade.add(new Paciente("A", 2));
        filaComPrioridade.add(new Paciente("B", 1));

        System.out.println(filaComPrioridade);
    }
}
