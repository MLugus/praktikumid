package opiGruppp;

public class MarguseYL {
	
	//Esimene ülesanne;
	//Koostage Java meetod; mis leiab etteantud reaalarvude massiivi d
	//põhjal niisuguste elementide arvu,
	//mis on rangelt suuremad kõigi elementide aritmeetilisest keskmisest 
	//aritmeetiline keskmine = summa / elementide_arv
	
	public static void main(String[] args) {
		double keskmine;
		int[] massiiv = new int[10];
		
				
		keskmine = massiiviKeskmine(massiiv);
		int suuremateArv = suuremadKeskmisest(massiiv, keskmine);
		
	} // main lõpp
	
	public static double massiiviKeskmine(int[] massiiv){
		double keskmine = 0;
		double elementideSum = 0;
		
		for(int i = 0; i < massiiv.length; i++){
			elementideSum += massiiv[i];
		}
		keskmine = elementideSum / massiiv.length;
		
		return keskmine;
	}
	
	public static int suuremadKeskmisest(int[] massiiv, double keskmine){
		int hulk = 0;
		for(int i = 0; i < massiiv.length; i++){
			if(massiiv[i] > keskmine){
				hulk++;
			}
		}
		
		return hulk;
	}
	
} // class lõpp
