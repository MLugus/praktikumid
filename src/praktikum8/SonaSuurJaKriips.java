package praktikum8;

import lib.TextIO;

public class SonaSuurJaKriips {

	public static void main(String[] args) {
		
		System.out.println("Sisesta sõna!");
		String sona = TextIO.getln();
		
		for(int i = 0; i < sona.length(); i++){
			System.out.print(sona.toUpperCase().charAt(i));
			if(i != sona.length() - 1){
				System.out.print(" - ");
			}
			
		}
		
		
	}
	
}
