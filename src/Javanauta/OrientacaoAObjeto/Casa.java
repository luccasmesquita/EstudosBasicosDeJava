package Javanauta.OrientacaoAObjeto;

public class Casa {
    public static void main(String[] args) {
        //criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //iniciando os atributos / variaveis / caracteristicas da casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "cinza";

        //chamando funcoes / metodos
        casa.construir();
        casa.pintarCasa();

        int resultado = casa.somarMetragem();
        System.out.println(resultado);


    }
}
