package model.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	//fiind static venitProiect, cand se modifica valoarea prin seter-ul static al lui
	//valoarea respectiva este modificata pentru toti angajatii
	//astfel, nu putem modifica pentru un angajat individual, ci modificam pentru toti deodata (fara discriminari)
	private static int venitProiect = 10;
	//adaugam atributul acesta static in fiecare clasa care extinde Aplicant

	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public static void setVenitProiect(int venitProiect) {
		Angajat.venitProiect = venitProiect;
	}

	public static int getVenitProiect() {
		return venitProiect;
	}

	public Angajat() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}
	
	//var.2: putem sa facem s-urile constante intr-un fisier de constante
//	public int finantare() {
//		int s=10;
//		// TODO Auto-generated method stub
//		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+s+" Euro/zi in proiect.");
//		return s;
//	}

	public void afisareVenit()
	{
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+getVenitProiect()+" Euro/zi in proiect.");
	}
}
