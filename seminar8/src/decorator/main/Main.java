package decorator.main;

import decorator.bilete.clase.Bilet;
import decorator.bilete.clase.BiletAbstract;
import decorator.bilete.decoratoare.BiletLocal;
import decorator.bilete.decoratoare.BiletNational;
import decorator.bilete.decoratoare.DecoratorBilet;

public class Main {
    public static void main(String[] args) {
        //E-cerinta 7
        BiletAbstract bilet1 = new Bilet("A","B",10.0);
        imprimantaBilete(bilet1);

        DecoratorBilet bilet2  =new BiletLocal(bilet1);
        bilet2.aplicaDiscountBilet();
        imprimantaBilete(bilet2);

        DecoratorBilet bilet3 = new BiletNational("Romania","Danemarca",20.0);
        bilet3.aplicaDiscountBilet();
        imprimantaBilete(bilet3);
    }
    public static void imprimantaBilete(BiletAbstract biletAbstract){
        biletAbstract.printareBilet();
    }
}