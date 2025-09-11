package NivelBasico;

public class Array {
    public static void main(String[] args) {
        //Arrays sao tipo referencia
        //String inicializam como null
        String[] ninjas = new String[3];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";

        System.out.println(ninjas[2]);

        //Array de idade
        //int inicializam como 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade);

        //boolean inicializam como false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        //double inicializam como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);

        //Redeclarar o array
        ninjas = new String[6];
        ninjas[0] = "Luccas";
        ninjas[1] = "Bruno";
        ninjas[2] = "Claudio";
        ninjas[3] = "Marco";
        ninjas[4] = "Alex";
        System.out.println(ninjas[0]);

        //for para fazer um loop no array
        for (int i = 0; i < 5; i++) {
            System.out.println(ninjas[i]);
        }

    }
}
