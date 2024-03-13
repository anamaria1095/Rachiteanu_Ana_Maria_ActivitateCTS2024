package FactoryMethod.fabrici;

import clase.Asistent;
import clase.PersonalSpital;

public class FabricaAsistent implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
