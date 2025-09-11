package Nivelintermediario.ClassesAbstratas;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    //construtor vazio
    public Ninja() {
    }
    //construtor com todos os argumentos
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //Metodo abstrato
    public abstract void habilidadeEspecial();

    // metodos abstratos - obrigatorio em todas as classes
    //sobreescrevendo o metodo da interface
    public void estrategiaDeBatalhaNinja(){
        System.out.println("eu sou " + nome + " e essa é minha estrategia de batalha");
    }
}
