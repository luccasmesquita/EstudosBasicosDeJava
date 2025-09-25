package Javanauta.OrientacaoAObjeto;

public class PlantaCasa {
    // atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("a casa foi construida, as caracteristicas são: ");
        System.out.println("metragem: " + metragem + " metros");
        System.out.println("numero de quartos: " + numeroQuartos);
        System.out.println("numero de banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }
    public void pintarCasa() {
        System.out.println("cor da casa: " + cor);
    }
}

