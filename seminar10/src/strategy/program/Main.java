package strategy.program;

import strategy.clase.Cash;
import strategy.clase.Client;
import strategy.clase.ModPlata;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Ion");
        ModPlata modPlata=new Cash();
        client.realizeazaPlata(20);
        client.setModPlata(modPlata);
        client.realizeazaPlata(30);
        client.realizeazaPlata(40);
    }
}