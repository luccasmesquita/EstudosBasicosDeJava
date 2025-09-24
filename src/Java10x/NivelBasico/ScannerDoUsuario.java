package Java10x.NivelBasico;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();


        System.out.println("Escreva a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();

        System.out.println("o nome do ninja é " + nomeDoNinja);
        System.out.println("o ninja tem " +idadeDoNinja + " anos");

        if(idadeDoNinja >= 18) {
            System.out.println("o ninja ja pode fazer missoes fora da aldeia");
        } else {
            System.out.println("o ninja ainda não pode fazer missoes fora da aldeia");
        }

        caixaDeTexto.close();
    }
}
