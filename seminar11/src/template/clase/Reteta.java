package template.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private int nrReteta;
    private List<String> listaMedicamente;

    public Reteta(int nrReteta) {
        this.nrReteta = nrReteta;
        this.listaMedicamente = new ArrayList<>();
    }
    public void adaugareMedicament(String medicament){
        this.listaMedicamente.add(medicament);
    }

    public List<String> getListaMedicamente() {
        return listaMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }
}
