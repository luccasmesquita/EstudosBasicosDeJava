package Java10x.Nivelintermediario.ArrrayLista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Array - são estaticos, nao alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        //Listas - não são estaticas, elas podem aumentar e diminuir
        List<String> ninjasList = new ArrayList<>();

        //adicionar na lista
        ninjasList.add("Naruto"); //index 0
        ninjasList.add("Sasuke"); //index 1
        ninjasList.add("Sakura"); //index 2

        System.out.println(ninjasList);

        //remover na lista
        ninjasList.remove(1);
        System.out.println(ninjasList);

        System.out.println("Tamanho da lista: " + ninjasList.size() + " elementos");

        //trocar elementos
        ninjasList.set(0, "Hashirama Senju");
        System.out.println(ninjasList);

    }
}
