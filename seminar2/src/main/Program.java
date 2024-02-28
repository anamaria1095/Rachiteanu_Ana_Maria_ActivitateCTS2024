package main;

import java.io.FileNotFoundException;
import java.util.List;

import model.clase.Angajat;
import model.clase.Aplicant;
import model.readere.AngajatReader;
import model.readere.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader angajatReader = new AngajatReader();
		//putem pune in aplicantReader un parametru fisier ca sa nu se modifice intre timp
		try {
			listaAngajati = angajatReader.readAplicanti("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
