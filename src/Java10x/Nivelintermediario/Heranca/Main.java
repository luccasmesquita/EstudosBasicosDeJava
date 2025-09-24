package Java10x.Nivelintermediario.Heranca;

public class Main {
    public static void main(String[] args) {
        //Criar um ninja
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da folha";
        Naruto.modoSabioativado();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 12;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.SharinganAtivado();

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura";
        Sakura.idade = 17;
        Sakura.aldeia = "Aldeia da folha";
        Sakura.ativarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.idade = 16;
        Hinata.aldeia = "Aldeia da folha";
        Hinata.ByakuganAtivado();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.idade = 9;
        Boruto.aldeia = "Aldeia da folha";
        Boruto.modoSabioativado();
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();

    }
}