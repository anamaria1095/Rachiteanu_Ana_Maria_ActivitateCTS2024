package observer.restaurantSubiect;

public class Restaurant extends Subiect{
    private String adresa;

    public Restaurant(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void notificareSchimbarePret() {
        super.notificaObserveri("Restaurantul de la "+ adresa+" are o oferta de pret ");
    }

    @Override
    public void notificareSchimbareMenu() {
        super.notificaObserveri("Restaurantul de la "+adresa+" si-a schimbat meniul");
    }

    @Override
    public void notificareEveniment(String data) {
        super.notificaObserveri("In data "+data+" , la adresa "+adresa+" va avea loc un eveniment social");
    }
}
