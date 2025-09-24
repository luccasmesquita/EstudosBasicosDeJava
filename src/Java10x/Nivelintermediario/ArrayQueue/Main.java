package Java10x.Nivelintermediario.ArrayQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Array
        String[] ninjasArray = new String[6];

        //Listas
        List<String> ninjasList = new ArrayList<>();

        //Stack
        Stack<String> ninjasStack = new Stack<>();

        //Queue - Filas

        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        //mostrar a fila
        System.out.println("Ninjas na fila: " + ninjasQueue);
        ninjasQueue.poll();

        System.out.println("Lista atualizada depois do poll " + ninjasQueue);

        //como ver quem é o primeiro - head
        ninjasQueue.peek();
        System.out.println("ninja no head " + ninjasQueue.peek());

        //adicionar a fila
        ninjasQueue.add("Hashirama");
        ninjasQueue.add("Tobirama");

        // não da pra deletar o tail

        //verificar se a fila esta vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila esta vazia");
        }

    }
}
