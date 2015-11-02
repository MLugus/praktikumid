package praktikum8;

import lib.TextIO;

public class Palindroom {

	public static void main(String[] args) {

		System.out.println("Sisestage palun yks s6na!");
		System.out.println("Kontrollime kas see s6na on palindroom.");
		String sona = TextIO.getln();
		boolean k = checkPalindrome(sona);
		if (k == false) {
			System.out.println("See s6na pole palindroom!");
		} else {
			System.out.println("See s6na on palindroom!");
		}
	}

	public static boolean checkPalindrome(String sona) {

		for (int i = 0; i < sona.length(); i++) {
			if ((sona.charAt(i)) != sona.charAt(sona.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
