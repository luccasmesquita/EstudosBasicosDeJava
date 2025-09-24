package Java10x.Nivelintermediario.ClassesAbstratas;

public class Uzumaki extends Ninja{
    // construtores
    public Uzumaki() {
    }
    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    // sobreescrever o metodo da classe ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade especial ");
    }
}
