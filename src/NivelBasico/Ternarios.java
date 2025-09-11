package NivelBasico;

public class Ternarios {
    public static void main(String[] args) {
        //    Ternarios são maneiras de reduzir o codigo
//        variavel = (condicao) ? valorVerdadeiro : valorFalso;

        short numeroDeMissoes = 1;
        String nivel = (numeroDeMissoes >= 10) ? "esse ninja esta com mais de 10 missoes" : "esse ninja tem menos de 10 missoes";
        System.out.println(nivel);
    }
}
