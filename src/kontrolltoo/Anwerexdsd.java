package kontrolltoo;

public class Anwerexdsd {

	public static void main(String[] args) {

		System.out.println(summaKuup(5., -5.));
	}

	public static double summaKuup(double a, double b) {

		double vastus = a + b;
		vastus = Math.pow(vastus, 3);

		return vastus;
	}

	public static boolean negPaaris(int n) {
		if (n < 0 && n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int negSumma(int[] m) {
		int negArvSum = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] < 0) {
				negArvSum += m[i];
			}
		}
		return negArvSum;

	}

	public static int keskmisestParemaid(double[] d) {
		int summa = 0;
		double arit = 0;

		for (int i = 0; i < d.length; i++) {
			arit += d[i];
		}
		arit = arit / d.length;

		for (int i = 0; i < d.length; i++) {
			if (arit < d[i]) {
				summa++;
			}
		}
		return summa;
	}
}