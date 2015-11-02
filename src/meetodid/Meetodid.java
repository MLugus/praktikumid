package meetodid;

import lib.TextIO;

public class Meetodid {

	public static int suvalineArv(int min, int max) {

		int suvaline;
		suvaline = min + (int) (Math.random() * ((max - min) + 1));

		return suvaline;
	}

	public static int kasutajaSisestus(int min, int max) {

		int arv;
		do {

			System.out.println("Sisestage �ks arv vahemikus " + min + " kuni " + max);
			arv = TextIO.getlnInt();

		}

		while (arv < min || arv > max);
		return arv;

	}

	public static String tagurpidiSona(String sisestus) {

		String reverse = new StringBuffer(sisestus).reverse().toString();
		return reverse;

	}

	// meetod, mis leiab ühemõõtmelise massiivi maksimumi
	public static int arrayMax(int[] massiiv) {
		int max = massiiv[0];
		for (int i = 0; i < massiiv.length; i++) {
			if (max < massiiv[i]) {
				max = massiiv[i];
			}

		}
		return max;
	}

}