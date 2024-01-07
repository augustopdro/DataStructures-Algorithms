package estruturas.vetor.exercicios;

import estruturas.vetor.Lista;
import estruturas.vetor.teste.Contato;

public class Exer06 {
    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<>(20);

        for(int i=1; i<=30; i++){
            Contato c1  = new Contato(String.format("Contato %d", i), "1234-1178", "contato1@email.com");
            vetor.adicionar(c1);
        }

        System.out.println(vetor);
    }
}
