package Javanauta.OrientacaoAObjeto.Heranca;

public class Main {
    public static void main(String[] args) {
        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("ração");

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.comer("milho");
    }
}
