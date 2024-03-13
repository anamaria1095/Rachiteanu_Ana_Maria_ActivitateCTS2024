package clase;

import static clase.TipAngajat.BRANCARDIER;

public class FactoryPersonal {
    public PersonalSpital createAngajat(TipAngajat tipAngajat, String nume, int salariu, int vechime){
        switch(tipAngajat){
            //e incalcat principiul single responsability
            case BRANCARDIER:
            return new Brancardier(nume, salariu) ;
            case ASISTENT:
                return new Asistent(nume, salariu);
            case MEDIC:
                return new Medic(nume, salariu,vechime);
            case INFIRMIER:
                return new Infirmier(nume, salariu);
            default:
                return null;
        }
    }
}
