package observer.program;

import observer.observer.Client;
import observer.observer.Observer;
import observer.observer.Turist;
import observer.restaurantSubiect.Restaurant;
import observer.restaurantSubiect.SalaDeSport;
import observer.restaurantSubiect.Subiect;

public class Main {
    public static void main(String[] args) {
        //B - 12
        Subiect restaurant1 = new Restaurant("Piata Romana nr.3");

        Observer client1 = new Client("Ana");
        Observer client2 = new Client("Mario");
        Observer client3 = new Client("Andrei");
        Observer client4 = new Client("Ioana");

        restaurant1.adaugaClient(client1);
        restaurant1.adaugaClient(client2);

        restaurant1.notificareEveniment("12 Mai");

        restaurant1.stergeClient(client1);
        restaurant1.adaugaClient(client3);
        restaurant1.adaugaClient(client4);

        restaurant1.notificareSchimbareMenu();
        restaurant1.notificareSchimbarePret();

        //daca apar turisti care vor sa frecventeze restaurantul, doar adaugam clasa turist care implementeaza interfata Observer
        Observer turist1 = new Turist();
        restaurant1.adaugaClient(turist1);
        restaurant1.notificareEveniment("10 iulie");

        //daca proprietarul are si o sala de sport

        //incalcam dependency inversion, dar daca trebuie folosit si altundeva
        // putem sa facem cast la SalaDeSport cand apelam metoda de notificareVolei
        Subiect salaDeSport = new SalaDeSport();

        salaDeSport.adaugaClient(client3);
        salaDeSport.adaugaClient(client4);

        ((SalaDeSport)salaDeSport).notificareMeciVolei();
        //o alta varianta este sa cream sala de sport de tip SalaDeSport
    }
}
