package program;

import clase.FactoryPersonal;
import clase.Medic;
import clase.PersonalSpital;
import clase.TipAngajat;

public class Main {
    public static void main(String[] args) {
        //clasa abstracta: PersonalSpital (atribute: nume, salariu) +afisare()
        //clase care mostenesc clasa abstracta: tipuri din enum
        //Factory: FactoryPersonal cu metoda creareAngajat(tipAngajat) care creaza tipurile de personal (surpriza)

        FactoryPersonal factoryPersonal = new FactoryPersonal();
        PersonalSpital medic = factoryPersonal.createAngajat(TipAngajat.MEDIC, "Gigel",12, 5);
        medic.afisare();
        PersonalSpital asistent = factoryPersonal.createAngajat(TipAngajat.ASISTENT, "Ionel",13,0);
        asistent.afisare();
    }
}