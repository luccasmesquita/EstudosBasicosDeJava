package Java10x.Desafios.Desafio2;

public class NinjaAvancado extends NinjaBasico implements Ninja {

    @Override
    public void mostrarInformacoes() {
        System.out.println("meu nome é" + nome + " minha idade é " + idade + "Minha especialidade é " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou " + nome + " e essa é minha habilidade");
    }

}
