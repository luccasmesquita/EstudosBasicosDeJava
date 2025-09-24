package Java10x.Desafios.Desafio2;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaBasico(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    public NinjaBasico() {
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade de um ninja");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Informacoes basicas de um ninja");
    }
}
