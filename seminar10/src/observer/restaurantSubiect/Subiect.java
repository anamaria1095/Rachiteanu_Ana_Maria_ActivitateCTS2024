package observer.restaurantSubiect;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaObserveri;

    public Subiect() {
        this.listaObserveri = new ArrayList<>();
    }

    public void adaugaClient(Observer observer){
        listaObserveri.add(observer);
    }
    public void stergeClient(Observer observer){
        listaObserveri.remove(observer);
    }
    protected void notificaObserveri(String mesaj){
        for(Observer observer: listaObserveri){
            observer.primesteNotificari(mesaj);
        }
    }
    abstract public void notificareSchimbarePret();
    abstract public void notificareSchimbareMenu();
    abstract public void notificareEveniment(String data);
}
