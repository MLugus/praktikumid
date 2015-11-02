package praktikum2;

import lib.TextIO;

public class Grupid {

	public static void main(String[] args) {
		
		int inimesed, grupp, jagatis, j22k;
		
		System.out.println("Kui palju inimesi on kokku? ");
		inimesed = TextIO.getlnInt();
		System.out.println("Mis on grupi suurus? ");
		grupp = TextIO.getlnInt();
		jagatis = inimesed / grupp;
		j22k = inimesed % grupp;
		System.out.println("Saab luua " + jagatis + " gruppi");
		System.out.println("Üle jääb " + j22k + " inimest");
	}
	
}
