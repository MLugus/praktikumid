package praktikum7;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;

public class ArraySortNimi {

	public static void main(String[] args) {

		ArrayList<String> nimed = new ArrayList<String>();

		String sisestus;
		do {
			sisestus = TextIO.getln();
			nimed.add(sisestus);

		} while (!sisestus.isEmpty());

		Collections.sort(nimed); 
		
		for (String nimi : nimed) {
			System.out.println(nimi);
		}

	}

}
