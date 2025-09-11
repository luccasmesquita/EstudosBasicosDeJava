package NivelBasico;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);
        String mensagem = """
                Escolha um ninja: 
                1 - Naruto
                2 - Sakura
                3 - Sasuke
                4 - Gaara
                """;
        System.out.println(mensagem);
        int escolha = caixaDeTexto.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Voce escolheu o naruto");
                break;
            case 2:
                System.out.println("Voce escolheu o Sakura");
                break;
            case 3:
                System.out.println("Voce escolheu o Sasuke");
                break;
            case 4:
                System.out.println("Voce escolheu o Gaara");
                break;
            default:
                System.out.println("Você não escolheu nenhum ninja");
                break;
        }
    }
}
