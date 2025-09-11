package Nivelintermediario.ClassesAbstratas;

public abstract class Ninja implements EstrategiaDeBatalha {
    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Gennin, Chinnin, Jounnin e Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    //construtor vazio
    public Ninja() {
    }
    //construtor com todos os argumentos
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos
    //sobrecarga de metodos voce nao precisa redeclarar o construtor, so os novos atributod
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //Metodo abstrato
    public abstract void habilidadeEspecial();

    // metodos abstratos - obrigatorio em todas as classes
    //sobreescrevendo o metodo da interface
    public void estrategiaDeBatalhaNinja(){
        System.out.println("eu sou " + nome + " e essa é minha estrategia de batalha");
    }
}
