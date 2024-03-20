package Prototype.model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements AbstractReteta{
    private String numeMedicament;
    private Map<String, Double> compozitieMedicament;
    private double gramajMedicament;

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, double gramajMedicament) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramajMedicament = gramajMedicament;
        double suma = 0.0;
        for (double cantitate:compozitieMedicament.values()) {
            suma = suma + cantitate;
        }
        if(suma>gramajMedicament+1.0 || suma<gramajMedicament-1.0){
            throw new RuntimeException("Gramaj incorect");
        }
    }
    private Reteta(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", compozitieMedicament=").append(compozitieMedicament);
        sb.append(", gramajMedicament=").append(gramajMedicament);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractReteta cloneaza() {
        Reteta reteta = new Reteta();
        reteta.numeMedicament = this.numeMedicament;
        reteta.compozitieMedicament = new HashMap<>();
        for(String cheie: this.compozitieMedicament.keySet()){
            reteta.compozitieMedicament.put(cheie, this.compozitieMedicament.get(cheie));
        }
        reteta.gramajMedicament = this.gramajMedicament;
        return reteta;
    }
}
