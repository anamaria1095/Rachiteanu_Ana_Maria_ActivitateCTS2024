package template.clase;

import com.sun.security.jgss.GSSUtil;

public class AchizitiePeBazaDeReteta extends AchizitieMedicamente{

    Reteta reteta;
    public AchizitiePeBazaDeReteta( Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void primesteReteta() {
        System.out.println("A fost primita reteta cu numarul " + reteta.getNrReteta());
    }

    @Override
    public boolean verificaStoc() {
        for(String medicament:reteta.getListaMedicamente()){
            if(!super.stocuri.containsKey(medicament)){
                System.out.println("Medicamentul " + medicament + " nu este in stoc");
                return false;
            }
        }
        return true;
    }

    @Override
    public void aducereMedicamente() {
        System.out.println("Medicamentele pentru reteta " +  reteta.getNrReteta() + " au fost aduse");
        for(String medicament:reteta.getListaMedicamente()){
           int stocDisponibil = super.stocuri.get(medicament) ;
           stocDisponibil--;

           super.stocuri.replace(medicament, stocDisponibil);
        }
        //parcurgem map-ul si daca pt vreun medicmaent avem valoarea <=0 , ii dam remove, il scoatem din map
    }

    @Override
    public void incaseaza() {
        System.out.println("Au fost incasati banii pt reteta "+  reteta.getNrReteta());
    }

    @Override
    public void emitereBon() {
        System.out.println("Bonul pentru reteta "+reteta.getNrReteta()+" a fost emis");
    }

    @Override
    public void respingeAchizitie() {
        System.out.println("Medicamentele din reteta "+reteta.getNrReteta()+" nu sunt disponibile");
    }
}
