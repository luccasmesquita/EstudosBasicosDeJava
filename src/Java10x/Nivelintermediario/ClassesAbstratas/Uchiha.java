package Java10x.Nivelintermediario.ClassesAbstratas;

public class Uchiha extends Ninja{

    public Uchiha() {
        super(); // pegando o construtor vazio da super class
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade); //pegando o construtor com todos os argumentos da super class
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    // sobreescrever o metodo da classe ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade especial ");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("meu nome é " + nome + " e essa é minha inteligencia de batalha");
    }
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é " + qi + "e você é um genio");
        } else if(qi >= 130) {
            System.out.println("Seu QI é " + qi + "e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é " + qi + "e você precisa treinar mais suas estrategias");
        }
    }

}
