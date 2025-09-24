package Java10x.Nivelintermediario.ResumaoArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*
        * 1 - Array - são estaticos, exigem um tamanho pre definido
        * 2 - Listas - são dinamicas, aumentam e diminuem de tamanho conforme precisamos
        * 3 - Stack -  são unicos, exitem uma ordem! O ultimo a entrar é o primeiro a sair!
        * */

        System.out.println("--------------------- Array ---------------------");
        //Array - arrays sao estaticos, sempre precisamos declarar o quanto de memoria iremos usar
        String[] nomeNinjaArray = new String[3];
        nomeNinjaArray[0] = "Naruto"; //adicionando um elemento no array atraves o indice
        nomeNinjaArray[1] = "Sasuke";
        nomeNinjaArray[2] = "Sakura";

        System.out.println("nomeNinjaArray : " + nomeNinjaArray); //ele me devolve o endereço de memoria
        System.out.println("nomeNinjaArray [0] : " + nomeNinjaArray[0]); //ele vai me devolver o indice que eu desejar

        System.out.println("--------------------- Lista ---------------------");
        //Lista é um pouco mais lenta em comparação a um array
        List<String> nomeNinjaList = new ArrayList<>(); // a lista pode crescer e diminuir
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("sakura Haruno");

        System.out.println("nomeNinjaList : " + nomeNinjaList); // na lista conseguimos imprimir a lista toda

        System.out.println("--------------------- Stack ---------------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki"); // adicionando elemento com push
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        nomeNinjaStack.push("Hinata Hyuga");

        System.out.println("nomeNinjaStack : " + nomeNinjaStack); // mostrar stack
        System.out.println("Tirar da pilha / stack: " + nomeNinjaStack.pop()); // removendo elemento com pop
        System.out.println("Mostrar ninja no topo/ sem remover: " + nomeNinjaStack.peek()); // mostrar ultimo elemento da lista sem remover
    }
}
