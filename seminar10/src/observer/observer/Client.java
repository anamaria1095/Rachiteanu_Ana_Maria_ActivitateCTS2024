package observer.observer;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificari(String mesaj) {
        System.out.println(nume + " a primit mesajul: " + mesaj);
    }
}
