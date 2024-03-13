package FactoryMethod.fabrici;

import clase.Infirmier;
import clase.PersonalSpital;

public class FabricaInfirmier implements FactoryAngajati{

    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
