package praktikum3;

import lib.TextIO;

public class Tehisintellekt {

	public static void main(String[] args) {
		
		int vanusA, vanusB;
		
		System.out.println("Sisestage palun üks vanus!");
		vanusA = TextIO.getlnInt();
		System.out.println("Sisetage palun veel üks vanus!");
		vanusB = TextIO.getlnInt();
		int vanuseVahe = Math.abs(vanusA - vanusB);
		
			if (vanuseVahe > 5 && vanuseVahe < 10)
			{System.out.println();
			System.out.println("Ma ütleks sulle midagi väga krõbedat, aga ma parem ei hakka.");
			}
				else if (vanuseVahe > 10)
				{System.out.println();
				System.out.println("Ma ütleks sulle midagi ropult krõbedat, aga ma parem ei hakka.");
			}
				else {System.out.println();
				System.out.println("Need vanused sobivad!");
					
				}
	}
}
