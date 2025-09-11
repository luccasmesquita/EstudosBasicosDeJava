package Nivelintermediario.Heranca;

public class Ninja {
    String nome;
    String aldeia;
    int idade;



    //metodo String vai ter que retornar uma String
    public String euSouUmNinja() {
        return "Oi, eu sou um ninja";
    }

    //metodo int vai ter que retornar uma int
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

}
