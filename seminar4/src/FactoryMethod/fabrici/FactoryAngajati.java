package FactoryMethod.fabrici;

import FactoryMethod.clase.Brancardier;
import clase.PersonalSpital;

public interface FactoryAngajati {
    public PersonalSpital creareAngajat(String nume, int salariu);
}
