package praktikum2;

import lib.TextIO;

public class KysiArveKorruta {

	public static void main(String[] args) {
		
		int korrutisa;
		int korrutisb;
		int korrutis;
		
	
		System.out.print("Kirjuta üks arv ");
		korrutisa = TextIO.getlnInt();
		System.out.print("Kirjuta teine arv ");
		korrutisb = TextIO.getlnInt();
		korrutis = korrutisa * korrutisb;
		System.out.println();
		System.out.println("Sa kirjutasid arvud " + korrutisa +" ja " + korrutisb);
		System.out.println("Nende arvude korrutis on " + korrutis);
		System.out.println();
	}

}
