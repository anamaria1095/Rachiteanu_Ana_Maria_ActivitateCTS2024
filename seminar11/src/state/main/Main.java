package state.main;

import state.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        //C 13
        Reteta reteta1 = new Reteta(1234, 5);
        reteta1.cumparaMedicamente();

        reteta1.solicitaMedicament();

        reteta1.respingeAchizitie();
        reteta1.solicitaMedicament();
        reteta1.solicitaMedicament();

        reteta1.cumparaMedicamente();
        reteta1.solicitaMedicament();
    }
}