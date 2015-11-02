package praktikum4;

import lib.TextIO;

public class KastiSees0JaXRisti {
	public static void main(String[] args) {

		int tabeliSuurus;
		System.out.print("Kui suur peab olema kast?");

		tabeliSuurus = TextIO.getlnInt();
		for (int i = 0; i < tabeliSuurus * 2 - 3; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for (int j = 0; j < tabeliSuurus; j++) {
			System.out.print("| ");
			for (int i = 0; i < tabeliSuurus; i++) {
				if (j == i || i + j == tabeliSuurus - 1)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.print("| ");
			System.out.println();

			for (int i = 0; i < tabeliSuurus * 2 - 3; i++) {
				System.out.print("-");
			}
		}

	}
}
