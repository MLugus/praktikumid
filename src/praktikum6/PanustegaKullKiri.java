package praktikum6;

import meetodid.Meetodid;

public class PanustegaKullKiri {

	public static void main(String[] args) {

		int min = 1, max = 2, raha = 100, panus = -1, tulemus = -1;

		System.out.println("Kull ja kiri");
		System.out.println("Kui tuleb kiri, saad topelt tagasi, kui tuleb kull siis kaotad oma panuse.");
		System.out.println("Sul on 100 raha, panustada saab maksimaalselt 25");
		while (raha > 0) {
			System.out.println("Sul on " + raha + " raha");
			System.out.println("Palun panustage!(max 25)");
			panus = Meetodid.kasutajaSisestus(1, 25);
			tulemus = Meetodid.suvalineArv(min, max);
			if (tulemus == 1) {
				System.out.println("Tuli kull, kaotasid " + panus + " raha");
				raha = raha -= panus;
				System.out.println("Sul on alles " + raha + " raha");
			}
			if (tulemus == 2) {
				System.out.println("Tuli kiri, võitsid juurde " + panus + " raha");
				raha = raha += panus * 2;
				System.out.println("Sul on nüüd " + raha + " raha");
			}
		}
		System.out.println("Sul on raha otsas!");
		System.out.println("MÄNG LÄBI!!");

	}

}
