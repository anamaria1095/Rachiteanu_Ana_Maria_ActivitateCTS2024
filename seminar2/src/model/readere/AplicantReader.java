package model.readere;

import model.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

//am transformat interfata in clasa abstracta
public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
    //am facut-o clasa abstracta ca sa putem implementa citirea bucatii care se repeta
    //astfel o putem apela de fiecare data cand citim , apoi citim si restul variabilelor specifice claselor concrete
    public void citireAplicant(Scanner input2, Aplicant aplicant){
        //ii trimitem zona in care a ajuns, adica un Scanner
        //ii trimitem si aplicantul ca sa stim ce fel de aplicant este si sa putem sa modificam valorile
        //nu puteam sa folosim constructor aici
        String nume = input2.next();
        String prenume = input2.next();
        int varsta = input2.nextInt();
        int punctaj = input2.nextInt();
        int nr = input2.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input2.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nr,vect);
    }

}
