package estruturas.fila.teste;

import estruturas.fila.FilaComPrioridade;

public class Aula024 {
    public static void main(String[] args) {

        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileirar(new Paciente("A", 2));
        fila.enfileirar(new Paciente("C", 1));
        fila.enfileirar(new Paciente("B", 3));

        System.out.println(fila);

        System.out.println(fila.desenfileirar());

        System.out.println(fila);
    }
}
