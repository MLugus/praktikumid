package praktikum6;

import meetodid.Meetodid;

public class PanustegaTaring {

	public static void main(String[] args) {

		int min = 1, max = 6, raha = 100, panus = -1, tulemus = -1, user;

		System.out.println("Panustega t�ringum�ng");
	
		while (raha > 0) {
			System.out.println("Sul on " + raha + " eurot");
			System.out.println("Mis arv veeretatakse?");
			user = Meetodid.kasutajaSisestus(1, 6);
			System.out.println("Palun panustage!");
			panus = Meetodid.kasutajaSisestus(1, raha);
			tulemus = Meetodid.suvalineArv(min, max);
			System.out.println("T�RINGUT VEEREDATAKSE!");
			if (tulemus == user) {
				System.out.println("Veeretati " + tulemus);
				raha = raha += panus * 6;
				System.out.println("V�itsite kuuekordselt panuse tagasi!");
			}
				else{
				System.out.println("Veeretati " + tulemus);
				raha = raha -= panus;
				System.out.println("Kaotasite " + panus + " eurot");
			}
		}
		System.out.println("Sul on raha otsas!");
		System.out.println("M�NG L�BI!!");
	
}
	
}