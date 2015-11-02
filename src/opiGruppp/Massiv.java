package opiGruppp;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Massiv {

	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Kui suurt massiivi soovid?");
		int massiiviSuurus = getInt();
		int[] massiiv = new int[massiiviSuurus];

		System.out.println();

		for (int i = 0; i < massiiviSuurus; i++) {
			System.out.println("Sisesta " + (i + 1) + ". number: ");
			massiiv[i] = getInt();
		}

		System.out.println();

		for (int massiiviElement : massiiv) {

			System.out.println(massiiviElement);

		}

		userInput.close();
	}

	public static int getInt() {

		int num = 0;
		try {
			num = userInput.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Error! " + e);
			userInput.next();// tühjen

		}

		return num;
	}
}
