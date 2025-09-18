package Nivelintermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 99999);

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 11111);
        System.out.println(cadastroUsandoRecord);
        System.out.println();
        System.out.println(cadastroUsandoRecord.emailCaixaAlta());;
    }
}
