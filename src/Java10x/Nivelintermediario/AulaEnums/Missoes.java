package Java10x.Nivelintermediario.AulaEnums;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    // metodo para mostar mais informacoes
    public void exibirDetalhes(){
        System.out.println("Missão: " + nome + " rank: " + rank + " Descricão: " + rank.getDescricao() + ", Dificuldade: " + rank.getDificuldade());
    }

    public Missoes() {
    }
    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
