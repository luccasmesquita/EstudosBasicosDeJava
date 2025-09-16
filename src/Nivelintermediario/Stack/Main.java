package Nivelintermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Arrays - sao estaticos e tem ref de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "NAruto Uzumaki";

        //Listas - sao dinamicas e tamanho aumenta e diminui conforme precisar
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        //Stack - o ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        ninjaStack.push("Hinata");

        System.out.println("Minha Stack atua: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha stack atualizada com pop: " + ninjaStack);
        System.out.println("Minha stack com procimo elemento do topo "+ ninjaStack.peek());
        System.out.println("Tamanho da minha stack " + ninjaStack.size() + " elementos");
    }
}
