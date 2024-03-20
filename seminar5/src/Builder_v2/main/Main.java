package Builder_v2.main;

import Builder_v2.model.AbstractBuilder;
import Builder_v2.model.Pacient;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new Pacient.PacientBuilder("Andrei");
        Pacient pacient=builder.adaugaMicDejunInclus(true).adaugaPapuciCamera(true).build();
        System.out.println(pacient);
    }
}
