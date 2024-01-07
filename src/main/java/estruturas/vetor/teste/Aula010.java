package estruturas.vetor.teste;

import estruturas.vetor.VetorObjetos;

public class Aula010 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-1178", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "1982-0078", "contato3@email.com");
        Contato c3 = new Contato("Contato 3", "6924-7678", "contato3@email.com");

        vetor.adicionar(c1);
        vetor.adicionar(c2);
        vetor.adicionar(c3);
        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println(vetor);
    }
}
