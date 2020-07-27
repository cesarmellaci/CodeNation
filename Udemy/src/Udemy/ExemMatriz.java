package Udemy;

import java.util.Scanner;

public class ExemMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int negativo = 0;
		
		int[][] mat = new int[n][n];
				
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Impressão da diagonal principal");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					negativo++;
				}
			}
		}
		System.out.println("Quantidade de números negativos: " + negativo);
		
		sc.close();
	}

}
