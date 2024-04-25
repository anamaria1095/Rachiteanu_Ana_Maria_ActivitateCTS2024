package observer.restaurantSubiect;

public class SalaDeSport extends Subiect{
    @Override
    public void notificareSchimbarePret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void notificareSchimbareMenu() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void notificareEveniment(String data) {
        super.notificaObserveri("In data de "+data+" va avea loc un eveniment caritabil in sala de sport");
    }
    public void notificareMeciVolei(){
        super.notificaObserveri("In sala de sport are loc un meci de volei");
    }
}
