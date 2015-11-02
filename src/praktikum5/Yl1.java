package praktikum5;

import lib.TextIO;

public class Yl1 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Tere! kirjuta palun üks positiivne arv");
		int arv = TextIO.getlnInt();
		
		int arvKuubis = kuup(arv);
		System.out.println(arvKuubis);
	}
	
	public static int kuup(int sisend){
		System.out.println("kuup meetod töötab");
		int tagastus = sisend*sisend*sisend;
	return tagastus;
		
		
			
		
	}
		
		
		
		
	}


