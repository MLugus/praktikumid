package praktikum3;

import lib.TextIO;

public class CumLaudedetektor {
	
public static void main(String[] args) {
	
	double KeskHinne, LopuToo;
	
	System.out.println("Mis on teie kaalutud keskhinne?");
	KeskHinne = TextIO.getlnDouble();
	
	if (KeskHinne < 0)  {
			System.out.print("ERROR! Palun anda positiivne hinne!");
			KeskHinne = TextIO.getlnDouble();
	}
	else if (KeskHinne > 5) { System.out.print("ERROR! Palun hinnet ühest-viieni!");
		KeskHinne = TextIO.getlnDouble();
	}
	
	System.out.println("Palun teie lõputöö hinnet!");
	
	LopuToo = TextIO.getlnDouble();
			if (LopuToo < 0)  {
				System.out.print("ERROR! Palun anda positiivne hinne!");
				LopuToo = TextIO.getlnDouble();
		}
		else if (LopuToo > 5) { System.out.print("ERROR! Palun hinnet ühest-viieni!");
			LopuToo = TextIO.getlnDouble();
		}
			
	if (KeskHinne >= 4.5 && LopuToo == 5)
	{System.out.println();
	System.out.println("Jah, sina saad cum laude diplomi!");
	}
	else {System.out.println();
	System.out.println("Ei, sina ei saa cum laude diplomit!");
	
	}
	
	
}
}
