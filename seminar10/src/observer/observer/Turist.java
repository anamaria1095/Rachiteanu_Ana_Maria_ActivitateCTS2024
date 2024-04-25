package observer.observer;

public class Turist implements Observer{
    @Override
    public void primesteNotificari(String mesaj) {
        System.out.println(mesaj);
    }
}
