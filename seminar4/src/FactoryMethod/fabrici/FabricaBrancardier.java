package FactoryMethod.fabrici;

import clase.Brancardier;
import clase.PersonalSpital;

public class FabricaBrancardier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
