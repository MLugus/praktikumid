package praktikum2;

import lib.TextIO;

public class t2htedeArv {

	public static void main(String[] args) {
		
		String nimi;
		int nimePikkus;
		
		System.out.println("Mis on su nimi? ");
		nimi = TextIO.getln();
		nimePikkus = nimi.length();
		System.out.println("Teie nimes on " + nimePikkus + " tähte.");
	}
}
