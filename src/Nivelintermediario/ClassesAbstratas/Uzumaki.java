package Nivelintermediario.ClassesAbstratas;

public class Uzumaki extends Ninja{

    // sobreescrever o metodo da classe ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade especial ");
    }
}
