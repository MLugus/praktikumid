package praktikum5;

import lib.TextIO;

public class Yl2Vahemikud {
	
	public static void main(String[] args) {
		
		int min = 25;
		int max = 568;
		kasutajaSisestus(min, max);
		System.out.println("arv sobib vahemikku!");
	}

	public static int kasutajaSisestus(int min, int max){
		
		int arv;
		do{
			
			System.out.println("Sisestage üks arv vahemikus " + min + " kuni " + max);
			arv = TextIO.getlnInt();
			
		}
			
		while(arv < min || arv > max );
			return arv;
			
	}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	
	

		
	
	

	

