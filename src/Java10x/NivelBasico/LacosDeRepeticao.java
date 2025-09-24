package Java10x.NivelBasico;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int numeroDeClones = 0;
        int totalDeClones = 40;

        while(numeroDeClones <= totalDeClones) {
            numeroDeClones++;
            System.out.println("Naruto fez mais um clone " + numeroDeClones);
        }

        for (int i = 0; i < totalDeClones; i++) {
            System.out.println("Sasuke matou naruto " + i );
        }
    }
}
