package FactoryMethod.fabrici;

import clase.Medic;
import clase.PersonalSpital;

public class FabricaMedic implements FactoryAngajati {

    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
