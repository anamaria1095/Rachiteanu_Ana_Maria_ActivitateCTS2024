package template.main;

import template.clase.AchizitieMedicamente;
import template.clase.AchizitiePeBazaDeReteta;
import template.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        //C 14
        Reteta reteta = new Reteta(1);
        reteta.adaugareMedicament("Paracetamol");
        reteta.adaugareMedicament("Nurofen");
        AchizitieMedicamente achizitieMedicamente = new AchizitiePeBazaDeReteta(reteta);
        achizitieMedicamente.achizitioneazaMedicamente();
    }
}
