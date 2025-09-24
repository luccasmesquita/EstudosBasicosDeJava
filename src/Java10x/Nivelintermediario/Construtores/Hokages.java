package Java10x.Nivelintermediario.Construtores;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    public abstract void sabedoriaHokage();

    public Hokages() {
        //construtor vazio, sem argumentos
        // sempre que criamos uma class o java cria um construtor vazio
    }

    //construtor com argumentos
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }
    //All args constructor = Construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
