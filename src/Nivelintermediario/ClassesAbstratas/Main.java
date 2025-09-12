package Nivelintermediario.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        //obj uzumaki
//        Uzumaki Naruto = new Uzumaki();
//        Naruto.nome = "Naruto Uzumaki";
//        Naruto.aldeia = "Aldeia da folha";
//        Naruto.idade = 16;
//        Naruto.habilidadeEspecial();
//        Naruto.estrategiaDeBatalhaNinja();

        System.out.println("------------------------Naruto------------------------");
        //recriando o naruto com novos argumentos nos construtores
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16, 20,NivelNinja.GENIN);
        Naruto.estrategiaDeBatalhaNinja();
        Naruto.habilidadeEspecial();
        Naruto.tacarKunai();
        System.out.println(Naruto);

        System.out.println("------------------------Sasuke------------------------");
        //obj sasuke uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 16;
        Sasuke.habilidadeEspecial();
        Sasuke.estrategiaDeBatalhaNinja();

        System.out.println("------------------------Itachi------------------------");
        //obj itachi uchiha
        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha",27);
        Itachi.habilidadeEspecial();

        System.out.println("------------------------Madara------------------------");
        //obj madara uchiha
        Uchiha Madara = new Uchiha("Madara Uchiha", "Aldeia da fola",45,900,NivelNinja.KAGE);
        Madara.inteligenciaDeCombate(180);
    }
}
