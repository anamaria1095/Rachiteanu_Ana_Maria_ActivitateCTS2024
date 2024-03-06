package model;

import org.w3c.dom.ls.LSOutput;
import singleton.Guvern;

public class Program {
    public static void main(String[] args) {
        //Singleton : initializam o singura data
        Guvern guvern1 = Guvern.getInstance(4,"Marcel",12);
        Guvern guvern2 = Guvern.getInstance(5,"Ionel",12);

        System.out.println(guvern1);
        System.out.println(guvern2);
    }
}
