package praktikum6;

import lib.TextIO;
import meetodid.Meetodid;

public class LiisuArray {

	public static void main(String[] args) {
		
		
		System.out.println("Liisu tõmbamine");
		System.out.println("Mitu inimest on grupis?");
		int inimesteArv = TextIO.getlnInt();
		String[] liisuRahvas = new String[inimesteArv];
		
		for(int i = 0; i <= (inimesteArv - 1); i++ ){
			System.out.println("Sisestage " + (i + 1) + ". nimi");
			liisuRahvas[i] = TextIO.getln();
		}
	
		int random = Meetodid.suvalineArv(0, (inimesteArv - 1));
		System.out.println("LOOS ON TEHTUD");
		System.out.println("Inimeseks on : " + liisuRahvas[random]);
		
	}
	
}
