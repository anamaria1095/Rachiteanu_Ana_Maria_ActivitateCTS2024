package template.clase;

import java.util.HashMap;
import java.util.Map;

public abstract class AchizitieMedicamente {
    Map<String, Integer> stocuri;

    public AchizitieMedicamente() {
        this.stocuri = new HashMap<>();
        stocuri.put("Paracetamol", 20);
        stocuri.put("Nurofen", 26);
        stocuri.put("Aspirina",12);
    }

    public final void achizitioneazaMedicamente(){
        primesteReteta();
        if(verificaStoc()){
            aducereMedicamente();
            incaseaza();
            emitereBon();
        }
        else {
            respingeAchizitie();
        }
    }
    public abstract void primesteReteta();
    public abstract boolean verificaStoc();
    public abstract void aducereMedicamente();
    public abstract void incaseaza();
    public abstract void emitereBon();
    public abstract void respingeAchizitie();
}
