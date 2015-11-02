package praktikum6;

import lib.TextIO;
import meetodid.Meetodid;

public class AraArvamisMang {

	public static void main(String[] args) {
		int max, min, luger, sisestus = -1;
		max = 100;
		min = 1;
		int arvutiArv = Meetodid.suvalineArv(min, max);
		System.out.println("Arvuti mõtles ühe arvu 1-100");
		System.out.println("Paku, mis number see oli!");

		for (luger = 0; sisestus != arvutiArv; luger++) {
			sisestus = TextIO.getlnInt();
			if (sisestus < arvutiArv) {
				System.out.println();
				System.out.println("Sinu pakutud arv oli väiksem");
				System.out.println("Paku uuesti!");
			}
			if (sisestus > arvutiArv) {
				System.out.println();
				System.out.println("Sinu pakutud arv oli suurem");
				System.out.println("Paku uuesti!");
			}
		}
		System.out.println();
		System.out.println("ÕIGE! Sa arvasid ära!");
		System.out.println("Arvuti arvuks oli " + arvutiArv);
		System.out.println("Sul läks ära arvamiseks " + luger + " korda");

	}// Main

}// class