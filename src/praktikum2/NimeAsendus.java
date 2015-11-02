package praktikum2;

import lib.TextIO;

public class NimeAsendus {
	public static void main(String[] args) {
		String loom, ymberLoom;
		System.out.println("Mis on teie lemmik loom? ");
		loom = TextIO.getln();
		ymberLoom = loom.replace('a', '_' );
		System.out.println(ymberLoom);
	}

}
