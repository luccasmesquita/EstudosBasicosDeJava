package Javanauta.OrientacaoAObjeto;

public class PlantaCasa implements Contrucao {
    // atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    @Override
    public void construir(){
        System.out.println("a casa foi construida, as caracteristicas são: ");
        System.out.println("metragem: " + metragem + " metros");
        System.out.println("numero de quartos: " + numeroQuartos);
        System.out.println("numero de banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);
    }

    //@override é uma anotação
    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor: " + cor);
    }

    @Override
    public int custoContrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    public void pintarCasa() {
        System.out.println("cor da casa: " + cor);
    }
}

