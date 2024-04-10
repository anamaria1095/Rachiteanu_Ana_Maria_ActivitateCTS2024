package decorator.bilete.decoratoare;

import decorator.bilete.clase.Bilet;
import decorator.bilete.clase.BiletAbstract;

public abstract class DecoratorBilet extends BiletAbstract {
    private BiletAbstract biletAbstract;

    public DecoratorBilet(String echipaGazda, String echipaOaspeti, double pretBilet) {
        super(echipaGazda, echipaOaspeti, pretBilet);
        this.biletAbstract = new Bilet(this.getEchipaGazda(),this.getEchipaOaspeti(),this.getPretBilet());
    }

    public DecoratorBilet(BiletAbstract biletDecorat) {
        super(biletDecorat.getEchipaGazda(), biletDecorat.getEchipaOaspeti(), biletDecorat.getPretBilet());
        this.biletAbstract = biletDecorat;
    }
    public abstract void aplicaDiscountBilet();

    public BiletAbstract getBiletAbstract() {
        return biletAbstract;
    }
}
