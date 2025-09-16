package Nivelintermediario.Generics;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenetica<EquipamentosNinja> bolsaGenetica = new BolsaGenetica<>();
        bolsaGenetica.adicionarEquipamentos(kunai);
        bolsaGenetica.adicionarEquipamentos(shuriken);
        bolsaGenetica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenetica);
    }
}
