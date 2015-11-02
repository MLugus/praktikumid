package praktikum6;

import lib.TextIO;
import meetodid.Meetodid;

public class SonaTagurpidiYL {

public static void main(String[] args) {
	
	System.out.println("Sisestage palun tekst mida tahate tagurpidi tagasi saada!");
	String sisestus = TextIO.getln();
	System.out.println("Teie text tagurpidi on järgmine : ");
	System.out.println(Meetodid.tagurpidiSona(sisestus));
	
}
		
		
	}
	

