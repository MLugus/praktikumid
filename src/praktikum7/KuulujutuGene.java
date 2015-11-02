package praktikum7;

import java.util.Random;

public class KuulujutuGene {
	
	public static void main(String[] args) {
		
		Random newRandom = new Random();
		
		
		String[] naisenimed = {"Kätlin", "Liis", "Mari", "Karin", "Pille"};
		String[] mehenimed = {"Madis", "Martin", "Karl", "Markus", "Tanel"};
		String[] tegusonad = {"tantsivad", "musitavad", "suksutavad", "laaberdavad", "laamendavad"};
		
		int a = newRandom.nextInt(naisenimed.length);
		int b = (int)(Math.random() * mehenimed.length);
		int c = (int)(Math.random() * tegusonad.length);

		
		System.out.println(naisenimed[a] + " ja " + mehenimed[b] + " " + tegusonad[c]);
	}

}
