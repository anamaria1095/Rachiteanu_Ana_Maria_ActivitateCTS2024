package model.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int venitProiect = 30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public static int getVenitProiect() {
		return venitProiect;
	}

	public static void setVenitProiect(int venitProiect) {
		Elev.venitProiect = venitProiect;
	}

	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte  + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
//	public int finantare() {
//		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+getVenitProiect()+" Euro/zi in proiect.");
//		return getVenitProiect();
//	}

	public void afisareVenit()
	{
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+getVenitProiect()+" Euro/zi in proiect.");
	}
	
}
