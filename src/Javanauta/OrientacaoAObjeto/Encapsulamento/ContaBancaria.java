package Javanauta.OrientacaoAObjeto.Encapsulamento;

public class ContaBancaria {
    //atributos
    private String titular;
    private double saldo;

    //criando construtores
    public ContaBancaria(){

    }
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    //construtor que inicializa a conta bancaria com saldo 0
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    //getter e setter - metodos padrões para acessar e modificar os atributos

    //metodo para obter o titular
    public String getTitular() {
        return titular;
    }

    //metodo para modificar o titular
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
