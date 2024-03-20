package Builder_v1.main;

import Builder_v1.main.model.AbstractBuilder;
import Builder_v1.main.model.Pacient;
import Builder_v1.main.model.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new PacientBuilder("Andrei");
        Pacient pacient = builder.adaugaHalatInterior().adaugaPapuciCamera().build();
//        pacient.setArePatRabatabil(true);
        //set-erii sunt protected ca sa nu putem modifica dupa ce este creata clasa concreta

        System.out.println(pacient);
    }
}