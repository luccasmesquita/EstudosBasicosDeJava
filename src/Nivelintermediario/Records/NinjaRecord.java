package Nivelintermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {
    // todos os atributos sao final por padrao
    // records não tem setter
    public String emailCaixaAlta() {
        return email.toUpperCase();
    }
}
