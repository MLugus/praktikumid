package praktikum6;

import lib.TextIO;

public class ArrayTagurpidi {

	public static void main(String[] args) {
		
		System.out.println("Palun kirjutada 10 numbrit, pärast igat numbrit vajutada ENTER");
		int[] numbrid = new int[10];
		for(int k = 0; k <= 9; k++){
			System.out.println("Sisestage " + (k + 1) + ". arv");
			numbrid[k] = TextIO.getlnInt();
		}
		for (int i = numbrid.length; i > 0; i--) {
			System.out.printf("%d ", numbrid[i-1]);
	}
	
}
}