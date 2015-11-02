package praktikum3;

import lib.TextIO;

public class ParooliKontroll {
public static void main(String[] args) {
	
	String parool, inputPWD;
	
	parool = "KooreKiht123";

System.out.println("Palun sisestage õige parool!");
	inputPWD = TextIO.getln();
	
	if ( inputPWD.equals(parool))
	{System.out.println();
	System.out.println("Parool on õige!");
	System.out.println("Teid logitakse kohe sisse!");
		}
	else {System.out.println();
	System.out.println("Teie sisestatud parool on vale!");
	}
}
}
