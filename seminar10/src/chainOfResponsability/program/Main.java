package chainOfResponsability.program;

import chainOfResponsability.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Gigel");
        client.realizeazaPlata(20);
        client.realizeazaPlata(20);
        client.realizeazaPlata(80);
    }
}
