package praktikum8;

import lib.TextIO;

public class KymmeSonaPlusPikkus {
	
	public static void main(String[] args) {
		
		System.out.println("Sisestage palun 10 s6na!");
		String[] sonad = new String[10];
		
		for(int i = 0; i < sonad.length; i++){
			
			System.out.println("Palun sisestage " + (i + 1) + " s6na!");
			sonad[i] = TextIO.getln();
		}
		
		massiiviSonadePikkusJaPrint(sonad);
		
	}

	public static void massiiviSonadePikkusJaPrint(String[] massiiv){
		int sonaPikkus;
		for(int i = 0; i < massiiv.length; i++){
			
			sonaPikkus = massiiv[i].length();
			System.out.println(sonaPikkus + " " + massiiv[i]);
		}
		
	}
	
}
