package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        System.out.println(queueCarros.add(new Carro("Peugeot"))); // IllegalStateException
        System.out.println(queueCarros);

        System.out.println(queueCarros.element()); // Cabeça, não remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault"))); // False se não for possível
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); // Elemento da cabeça da fila (se vazia: null)
        System.out.println(queueCarros);

        System.out.println(queueCarros.remove()); // Remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); // Remove ou retorna nulo, caso a fila seja vazia
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

    }
}
