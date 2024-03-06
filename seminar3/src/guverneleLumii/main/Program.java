package guverneleLumii.main;

import guverneleLumii.model.GuvernRegistry;
import guverneleLumii.model.Guvern;

public class Program {
    public static void main(String[] args) {
        GuvernRegistry guvernRegistry = GuvernRegistry.getInstance();
        guvernRegistry.adaugaGuvern("Romania","Popescu Ion", 20);
        guvernRegistry.adaugaGuvern("Romania","Marcel Ion", 10);
        guvernRegistry.adaugaGuvern("Ungaria","Szabo", 40);

        guvernRegistry.getGuvern("Romania").setNumePrimMinistru("Bogdan");

        System.out.println(guvernRegistry.getGuvern("Romania"));
        System.out.println(guvernRegistry.getGuvern("Ungaria"));
        
    }
}
