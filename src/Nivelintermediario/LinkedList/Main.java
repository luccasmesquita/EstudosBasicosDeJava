package Nivelintermediario.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");
        linkedList.add("Naruto Uzumaki");

        System.out.println(linkedList);


        //não permite elementos duplicados
        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.addAll(linkedList);
        /* ninjaSet.add("Naruto");
        ninjaSet.add("Sasuke");
        ninjaSet.add("Sakura");
        ninjaSet.add("Naruto"); //ele não mostra esse elemento

         */

        System.out.println(ninjaSet);

    }
}
