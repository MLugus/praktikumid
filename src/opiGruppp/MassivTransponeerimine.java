package opiGruppp;

public class MassivTransponeerimine {

	public static void main(String[] args) {

		int rowSize = 0, colSize = 0;
		System.out.println("Mitu rida maatriksis?");
		while (rowSize == 0) {
			rowSize = Matrix.getInt();
		}
		System.out.println("Mitu veergu on maatriksis?");
		while (colSize == 0) {
			colSize = Matrix.getInt();
		}

		int[][] maatriks = new int[rowSize][colSize];

		maatriks = Matrix.generateMatrix(rowSize, colSize);

		Matrix.printMatrix(maatriks);

		int[][] maatriks2 = new int[colSize][rowSize];

		for (int row = 0; row < rowSize; row++) {
			for (int col = 0; col < colSize; col++) {
				maatriks2[col][row] = maatriks[row][col];
			}
		}
		System.out.println();

		Matrix.printMatrix(maatriks2);

		twoMin(maatriks);
	} // Main lõpp

	public static void twoMin(int[][] massiiv){
		
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int[] row : massiiv){
			for(int col : row){
				if(col < min1){
					min1 = col;
				}if(col < min2 && col != min1){
					min2 = col;
				}
			}
		}
		System.out.println("Min v22rtused: " + min1 + " " + min2);
	}
	
} // classi lõpp
