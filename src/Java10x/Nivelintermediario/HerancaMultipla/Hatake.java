package Java10x.Nivelintermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterfasce {

    public void sharinganAtivado() {
        System.out.println(nome + " ativou o sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + "Eu sou um ninja de elite da Anbu");

    }

    public void boasVindas() {
        System.out.println(nome + ", eu sou um Hatake");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + ", eu eu sou um Hokage");
    }
}
