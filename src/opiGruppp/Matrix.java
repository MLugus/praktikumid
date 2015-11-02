package opiGruppp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {
	public static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int rowSize = 0, colSize = 0;
		System.out.println("Mitu rida maatriksis?");
		while(rowSize == 0){
		rowSize = getInt();
		}		
		System.out.println("Mitu veergu on maatriksis?");
		while(colSize == 0){
			colSize = getInt();
		}
		
		int[][] matrix = new int[rowSize][colSize];
		matrix = generateMatrix(rowSize, colSize);
		
		printMatrix(matrix);
		
		userInput.close();
	} // main lõpp
	
	public static int getInt() {

		int num = 0;
		try {
			num = userInput.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Error! " + e);
			userInput.next();// tühjen

		}

		return num;
	} // getInt lõpp
	
	public static int[][] generateMatrix(int row,int column){
		
		int[][] matrix = new int[row][column];
		for(int x = 0; x < row; x++){
			for(int y = 0; y < column; y++){
				matrix[x][y] = (int)(Math.random() * 100);
			}
		}
		return matrix;
	} // generateMatrix lõpp
	
	public static void printMatrix(int[][] massiiv){
		
		for(int x = 0; x < massiiv.length; x++){
			for(int y = 0; y < massiiv[x].length; y++){
				System.out.printf("%2d ", massiiv[x][y]);
			}
		System.out.println();
		}
		
	} // printMatrix lõpp
	
} // Classi lõpp
