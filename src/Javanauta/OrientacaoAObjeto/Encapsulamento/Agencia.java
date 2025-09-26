package Javanauta.OrientacaoAObjeto.Encapsulamento;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Luccas");
        minhaConta.setTitular("Luccas Mesquita");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("o titular da conta é: " + titularConta + " e o saldo final é: " + saldoFinal);
    }
}
