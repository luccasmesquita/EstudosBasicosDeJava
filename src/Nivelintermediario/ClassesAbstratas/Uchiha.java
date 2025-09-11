package Nivelintermediario.ClassesAbstratas;

public class Uchiha extends Ninja{

    public Uchiha() {
        super(); // pegando o construtor vazio da super class
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade); //pegando o construtor com todos os argumentos da super class
    }

    // sobreescrever o metodo da classe ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade especial ");
    }

}
