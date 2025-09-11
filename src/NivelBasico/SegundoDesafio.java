package NivelBasico;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        //entrada de dados
        Scanner scanner = new Scanner(System.in);

        //fazer o array
        int numeroMax = 1;
        String[] ninjas = new String[numeroMax];

        //contadores
        int cadastrados = 0;
        int opcao = 0;


        while(opcao != 3) {
            //menu
            System.out.println("""
                ===== Menu Ninja =====
                
                1 - Adicionar novo ninja
                2 - Listar ninjas
                3 - Sair
                
                Escolha uma opção:
                """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if(cadastrados < numeroMax) {
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[cadastrados] = nomeNinja;
                        cadastrados++;
                        System.out.println("Ninja " + nomeNinja + " cadastrado com sucesso");
                    } else {
                        System.out.println("A Lista de ninjas esta cheia");
                    }
                    break;
                case 2:
                    if(cadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        System.out.println("Lidta de Ninjas");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Estamos saindo do programa...");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}
