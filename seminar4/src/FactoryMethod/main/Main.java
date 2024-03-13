package FactoryMethod.main;

import clase.PersonalSpital;
import FactoryMethod.fabrici.FabricaAsistent;
import FactoryMethod.fabrici.FabricaInfirmier;
import FactoryMethod.fabrici.FabricaMedic;
import FactoryMethod.fabrici.FactoryAngajati;

public class Main {
    public static void main(String[] args) {
        FactoryAngajati factoryAngajati = new FabricaAsistent();
        procesareAngajat(factoryAngajati, "Rares", 1000);
        procesareAngajat(new FabricaMedic(), "Alex", 10);
        procesareAngajat(new FabricaInfirmier(),"Florin",2500);
    }
    public static void procesareAngajat(FactoryAngajati factory, String nume, int salariu){
            PersonalSpital angajat1 = factory.creareAngajat(nume, salariu);
            angajat1.afisare();
    }
}
