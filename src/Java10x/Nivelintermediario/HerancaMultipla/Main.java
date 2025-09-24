package Java10x.Nivelintermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        //obj sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 16;
        Sasuke.sharinganAtivado();

        //obj kakashi
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 86;
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();

        //obj Uzumaki
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Usumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 15;

    }
}
