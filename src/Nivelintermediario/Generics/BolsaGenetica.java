package Nivelintermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenetica<T> {
    private List<T> equipamentos;

    public BolsaGenetica() {
        this.equipamentos = new ArrayList<>();
    }

    //colocar equipamentos genericos
    public void adicionarEquipamentos(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
