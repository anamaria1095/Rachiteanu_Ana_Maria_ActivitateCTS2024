package main;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;
import adapter.softVechi.*;

public class Main {
    public static void platesteConsumatia(SoftBucatarie comanda){
        comanda.printareBon();
    }
    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs = new Produs("Pizza", 52);
        Produs produs1 = new Produs("Paste",45);
        bucatarie.adaugaProdus(produs);
        bucatarie.adaugaProdus(produs1);

        platesteConsumatia(bucatarie);

        Bar bar = new Bar();
        bar.adaugaBautura(new Bautura(12,"Cola", 0.0F));
        Bautura bautura = new Bautura(25, "Mojito",25.5F);
        bar.adaugaBautura(bautura);


        AdapterComandaBarBucatarie bar1 = new AdapterComandaBarBucatarie();
        bar1.adaugaBautura(new Bautura(15,"Pepsi", 0));
        bar1.adaugaBautura(new Bautura(20,"Cola", 0));
        bar1.adaugaBautura(new Bautura(18,"Sprite", 0));
        bar1.adaugaProdus(new AdapterBauturaProdus(new Bautura(5,"Apa",0)));

        Bautura bautura1 = new Bautura(5, "apa",0);
        AdapterBauturaProdus produs2 = new AdapterBauturaProdus(bautura1);
        bar1.adaugaProdus(produs2);
        platesteConsumatia(bar1);
    }
}